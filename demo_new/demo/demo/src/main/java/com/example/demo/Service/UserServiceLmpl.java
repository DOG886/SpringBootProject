package com.example.demo.Service;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceLmpl implements  UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User regist(User user) {
        //如果你mypper没有写sql，这里可以点出来他自带的方法，这里的save就是自带的新增方法
        return userMapper.save(user);
    }
    @Override
    public List<User> login(User user){
        return  userMapper.findUByUsernameAndPassword(user.getName(),user.getPassword());
    }
}
