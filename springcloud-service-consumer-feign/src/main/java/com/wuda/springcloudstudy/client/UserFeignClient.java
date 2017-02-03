package com.wuda.springcloudstudy.client;

import com.wuda.springcloudstudy.dto.UserDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "springcloud-service-provider", fallback = UserFeignClient.UserFeignClientFallback.class)
public interface UserFeignClient {
    @RequestMapping("/user/name/{name}")
    UserDto findByName(@RequestParam("name") String name);

    @Component
    class UserFeignClientFallback implements UserFeignClient {
        @Override
        public UserDto findByName(@RequestParam("name") String name) {
            UserDto userDto = new UserDto();
            userDto.setSex("man");
            userDto.setName(name + " : default");
            userDto.setEmail("default@default.com");
            return userDto;
        }
    }
}
