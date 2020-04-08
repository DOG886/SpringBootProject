package com.example.demo.Service;

import com.example.demo.User.User;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface UserService {
    User regist(User user);
    List<User> login(User user);
}
