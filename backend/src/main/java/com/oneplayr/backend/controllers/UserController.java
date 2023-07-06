package com.oneplayr.backend.controllers;

import com.oneplayr.backend.entity.UserEntity;
import com.oneplayr.backend.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public List<UserEntity> getAllUsers() {
    List<UserEntity> users = userService.getAllUsers();
    System.out.println("users : " + users);
    return users;
  }

  @GetMapping("/{userId}")
  public UserEntity getUserById(@PathVariable Long userId) {
    UserEntity user = userService.getUserById(userId);
    System.out.println("userId:" + userId + " : user : " + user);
    return user;
  }

  @PostMapping
  public String saveUser(@RequestBody UserEntity user) {
    userService.saveUser(user);
    return "user saved successfully!";
  }

  @DeleteMapping("/{userId}")
  public String updateUser(
    @RequestBody UserEntity user,
    @PathVariable Long userId
  ) {
    userService.updateUser(user, userId);
    return "user updated successfully!";
  }

  public String deleteUserId(@PathVariable Long userId) {
    userService.deleteUserId(userId);
    return "user deleted successfully!";
  }
}
