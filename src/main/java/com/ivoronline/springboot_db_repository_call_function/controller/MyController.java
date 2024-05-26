package com.ivoronline.springboot_db_repository_call_function.controller;

import com.ivoronline.springboot_db_repository_call_function.repository.UtilEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private UtilEntityRepository utilEntityRepository;

  //=========================================================================================================
  // CALL FUNCTION
  //=========================================================================================================
  // http://localhost:8080/callFunction?name=John&age=50
  @ResponseBody
  @GetMapping("/callFunction")
  public String callFunction(@RequestParam String name, @RequestParam Integer age) {
    return utilEntityRepository.callFunction(name, age);
  }

  //=========================================================================================================
  // CALL FUNCTION WITH ALIASES
  //=========================================================================================================
  // http://localhost:8080/callFunctionWithAliases?name=John&age=50
  @ResponseBody
  @GetMapping("/callFunctionWithAliases")
  public String callFunctionWithAliases(@RequestParam String name, @RequestParam Integer age) {
    return utilEntityRepository.callFunctionWithAliases(name, age);
  }

}

