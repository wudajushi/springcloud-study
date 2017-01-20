package com.wuda.springcloudstudy.service.impl;

import com.wuda.springcloudstudy.dao.UserRepository;
import com.wuda.springcloudstudy.entity.UserEntity;
import com.wuda.springcloudstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
