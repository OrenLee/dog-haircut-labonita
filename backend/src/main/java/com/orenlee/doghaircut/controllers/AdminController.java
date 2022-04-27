package com.orenlee.doghaircut.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

  @ResponseStatus(value = HttpStatus.OK)
  @GetMapping("/admin")
  public String getAdmin(){
    return "Hello World";
  }

}
