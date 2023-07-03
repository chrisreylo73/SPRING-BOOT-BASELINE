package com.oneplayr.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
   @RequestMapping
   public String hello(){
      return "Hello World";
   }
}
