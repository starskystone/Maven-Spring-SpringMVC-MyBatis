package com.xaut.controller;

import com.xaut.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("student")
public class StudentController {
    @Resource(name = "studentService")

    private StudentService service;

    @RequestMapping(value = "getAllStudent", method = RequestMethod.GET)
    public ModelAndView getAllStudent(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("studentDisplay");
        mav.addObject("students",service.getAllStudent());

        return mav;
    }
}
