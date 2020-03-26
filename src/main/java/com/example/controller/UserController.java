package com.example.controller;

import com.example.bean.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
@RequestMapping("login/{admin}/{password}")

    public Result login(@PathVariable("admin") String admin, @PathVariable("password") String passWord){
        Result result = new Result();


    System.out.println("账户"+admin+"密码"+passWord);

        if(admin != null && admin.equals("18108040261") ){
          if(passWord != null && passWord.equals("123456")){
              log.info("密码是"+passWord);
              return result.setState(200);

          }
          else{
              return result.setState(203);
          }
        }else{
            log.info("账户");
            return result.setState(204);
        }
    }
    @RequestMapping("/test")
    public String Test(){
    return "i am you father you know";

    }
}
