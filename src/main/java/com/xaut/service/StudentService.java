package com.xaut.service;


import com.xaut.dao.StudentDao;
import com.xaut.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentService {
    @Resource(name = "studentDao")
    private StudentDao dao;

    public List<Student> getAllStudent(){
        return dao.findAll();
    }
}
