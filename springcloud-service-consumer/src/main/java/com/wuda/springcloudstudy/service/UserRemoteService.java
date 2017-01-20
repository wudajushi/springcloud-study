package com.wuda.springcloudstudy.service;

import com.wuda.springcloudstudy.dto.UserDto;

public interface UserRemoteService {
    UserDto findByName(String name);
}
