package com.oneplayr.backend.service;

import java.util.List;

import com.oneplayr.backend.entity.UserEntity;

public interface UserService {
   List<UserEntity> getAllUsers();
   UserEntity getUserById(Long userId);
   void saveUser(UserEntity user);
   void updateUser(UserEntity user, Long userId);
   void deleteUserId(Long userId);
}
