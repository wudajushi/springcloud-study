package com.wuda.springcloudstudy.controller;

import com.wuda.springcloudstudy.client.UserFeignClient;
import com.wuda.springcloudstudy.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserFeignController {
    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/name/{name}")
    public UserDto findByName(@PathVariable("name") String name) {
        return userFeignClient.findByName(name);
    }
}
