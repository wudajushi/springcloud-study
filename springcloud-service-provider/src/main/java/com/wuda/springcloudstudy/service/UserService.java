package com.wuda.springcloudstudy.service;

import com.wuda.springcloudstudy.entity.UserEntity;

public interface UserService {
    UserEntity findByName(String name);

    UserEntity save(UserEntity userEntity);
}
