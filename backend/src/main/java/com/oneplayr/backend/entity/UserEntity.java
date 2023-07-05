package com.oneplayr.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user", schema = "public")
public class UserEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column
   private String name;

   @Column
   private String city;

   public UserEntity(){
   }

   public UserEntity(Long id, String name, String city){
      this.id = id;
      this.name = name;
      this.city = city;
   }

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getCity() {
      return city;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setCity(String city) {
      this.city = city;
   }

   
}
