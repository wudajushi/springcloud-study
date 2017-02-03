package com.wuda.springcloudstudy.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wuda.springcloudstudy.dto.UserDto;
import com.wuda.springcloudstudy.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonHystrixServiceImpl implements RibbonHystrixService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public UserDto findByName(String name) {
        return restTemplate.getForObject("http://springcloud-service-provider/user/name/" + name, UserDto.class);
    }

    public UserDto fallback(String name) {
        UserDto userDto = new UserDto();
        userDto.setEmail("default@default.com");
        userDto.setName("default");
        userDto.setSex("man");
        return userDto;
    }
}
