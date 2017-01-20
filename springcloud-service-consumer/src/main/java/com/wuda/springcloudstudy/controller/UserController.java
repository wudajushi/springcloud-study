package com.wuda.springcloudstudy.controller;

import com.wuda.springcloudstudy.dto.UserDto;
import com.wuda.springcloudstudy.service.UserRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserRemoteService userRemoteService;

    @GetMapping("/{name}")
    public UserDto findByName(@PathVariable("name") String name) {
        return userRemoteService.findByName(name);
    }
}
