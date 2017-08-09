package com.xaut.controller;

import com.xaut.pojo.User;
import com.xaut.service.UserService;
import com.xaut.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping("findUser")
    public ModelAndView finduser()throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        List<User> users = service.findeUser();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("studentDisplay");

        return modelAndView;
    }
}
