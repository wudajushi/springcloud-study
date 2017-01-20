package com.wuda.springcloudstudy.service.impl;

import com.wuda.springcloudstudy.dto.UserDto;
import com.wuda.springcloudstudy.service.UserRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserRemoteServiceImpl implements UserRemoteService {
    @Autowired
    private RestTemplate restTemplate;

    public UserDto findByName(String name) {
        return restTemplate.getForObject("http://springcloud-service-provider/user/name/" + name, UserDto.class);
    }
}
