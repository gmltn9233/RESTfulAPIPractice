package com.example.restfulapipractice.controller;

import com.example.restfulapipractice.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{name}")
    public String findByName(@PathVariable("name") String name){
        return "Name: "+name;
    }

    @GetMapping("/user")
    public User saveUser(@RequestParam("name") String name, @RequestParam("studentId") Long studentId){
        User user = new User();
        user.setName(name);
        user.setStudentId(studentId);
        return user;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        // user 객체를 받아서 이름을 변경
        user.setName("user2");
        return user;
    }

    @ResponseBody
    @GetMapping("/data")
    public User getUser(){
        User user = new User();
        user.setName("user1");
        user.setStudentId(1234L);
        return user;
    }

    @PostMapping("/{user}")
    public String findByName2(@PathVariable("name") String name){
        return
    }

}
