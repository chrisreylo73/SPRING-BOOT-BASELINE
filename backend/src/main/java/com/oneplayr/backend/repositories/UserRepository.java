package com.oneplayr.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneplayr.backend.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
   
}
