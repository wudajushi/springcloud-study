package com.wuda.springcloudstudy.controller;

import com.wuda.springcloudstudy.entity.UserEntity;
import com.wuda.springcloudstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/name/{name}")
    @ResponseBody
    public UserEntity findByName(@PathVariable(value = "name", required = true) String name) {
        return userService.findByName(name);
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }

    @PostMapping("/save")
    public String save(UserEntity userEntity, RedirectAttributes redirectAttributes) {
        UserEntity persistUserEntity = userService.save(userEntity);
        redirectAttributes.addFlashAttribute("message", "添加成功！ID：" + persistUserEntity.getId());
        return "redirect:/user/add";
    }
}
