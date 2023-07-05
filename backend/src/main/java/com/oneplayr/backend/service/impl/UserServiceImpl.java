package com.oneplayr.backend.service.impl;
import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneplayr.backend.entity.UserEntity;
import com.oneplayr.backend.repositories.UserRepository;
import com.oneplayr.backend.service.UserService;


@Service
public class UserServiceImpl implements UserService {
   
   @Autowired
   private UserRepository userRepository;

   @Override
   public List<UserEntity> getAllUsers() {
      return userRepository.findAll();
   }

   @Override
   public UserEntity getUserById(Long userId) {
      Optional<UserEntity> userOpt = userRepository.findById(userId);
      if (userOpt.isPresent()){
         return userOpt.get();
      }
      else{
         throw new RuntimeException("User not found.");
      }
   }      

   @Override
   public void saveUser(UserEntity user) {
      UserEntity userDetail = userRepository.save(user);
      System.out.println("user saved to db with userId : " + userDetail.getId());
   }

   @Override
   public void updateUser(UserEntity user, Long userId) {
      Optional<UserEntity> userDetailOpt = userRepository.findById(userId);
      if (userDetailOpt.isPresent()){
         UserEntity userDetail = userDetailOpt.get();
         if (user.getName() != null || user.getName().isEmpty()) {
            userDetail.setName(user.getName());
         }
         if (user.getEmail() != null || user.getEmail().isEmpty()) {
            userDetail.setEmail(user.getEmail());
         }
         if (user.getUsername() != null || user.getUsername().isEmpty()) {
            userDetail.setUsername(user.getUsername());
         }
         if (user.getPassword() != null || user.getPassword().isEmpty()) {
            userDetail.setPassword(user.getPassword());
         }
         userRepository.save(userDetail);
      }
      else{
         throw new RuntimeException(" User not found.");
      }
   }

   @Override
   public void deleteUserId(Long userId) {
      Optional<UserEntity> userOpt = userRepository.findById(userId);
      if (userOpt.isPresent()) {
         userRepository.deleteById(userId);
      } else {
         throw new RuntimeException(" User not found.");
      }
   }
   
}
