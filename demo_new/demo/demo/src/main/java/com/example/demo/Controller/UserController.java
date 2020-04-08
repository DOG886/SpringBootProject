package com.example.demo.Controller;

import com.example.demo.User.User;
import com.example.demo.Service.UserServiceLmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceLmpl userServiceLmpl;
//    @RequestMapping(value = "/regist")
    //你可以自定义请求方式
    @PostMapping(value = "/regist")
    public User regist(User user){

        return userServiceLmpl.regist(user);
    }
    @PostMapping(value = "/login")
    public HashMap<String,Object> login(User user){
        HashMap<String,Object> map=new HashMap<String,Object>();
       if(userServiceLmpl.login(user)==null ||userServiceLmpl.login(user).isEmpty()){
//           map.put("user",user);
           map.put("code",400);
           map.put("message","failed");
           return map;

       }else {
           map.put("message",200);
           map.put("user",user.getName());
           return  map;
       }
    }
    @PostMapping(value = "/test")
    public List<User> test(User user){
            return  userServiceLmpl.login(user);
    }
}
