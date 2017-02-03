package com.wuda.springcloudstudy.service;

import com.wuda.springcloudstudy.dto.UserDto;

public interface RibbonHystrixService {
    UserDto findByName(String name);
}
