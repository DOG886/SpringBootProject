package com.example.demo.Mapper;

import com.example.demo.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
//@Repository
//@Mapper
//这里使用的是springdatajpa，继承他的内部接口，可以帮我们写sql
public interface UserMapper extends JpaRepository<User,Integer> {
    //这里我把mybatis的maven删除了，用了jpa就不能用mybatis，他们两个都是orm框架，取其一就可以了
    //还有jpa单表的增删改查不需要写sql语句
//    @Insert("insert into user (user_name,user_sex,user_pwd) values(#{name},#{pwd},#{sex})")
//    void regist(User user);
    List<User> findUByUsernameAndPassword(String username,String password);
}
