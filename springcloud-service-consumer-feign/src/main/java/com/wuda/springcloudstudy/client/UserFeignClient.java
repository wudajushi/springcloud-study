package com.wuda.springcloudstudy.client;

import com.wuda.springcloudstudy.dto.UserDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "springcloud-service-provider")
public interface UserFeignClient {
    @RequestMapping("/user/name/{name}")
    UserDto findByName(@RequestParam("name") String name);
}
