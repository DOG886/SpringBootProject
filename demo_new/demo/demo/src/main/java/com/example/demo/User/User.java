package com.example.demo.User;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    /**
     * 这些注解的意思你百度就可以了
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true,nullable = false,length = 50)
    private Integer id;
    @Column(name="user_name",nullable = false,length = 50)
    private String username;
    @Column(name = "password",nullable = false,length = 50)
    private  String password;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName(){
        return  username;
    }
    public String getPassword(){
        return password;
    }
    public  void setUsername(String username){
        this.username=username;
    }
    public  void setPassword(String password){
        this.password=password;
    }
}
