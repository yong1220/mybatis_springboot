package com.cy.mybatis_springboot.controller;

import com.cy.mybatis_springboot.mapper.StudentMapper;
import com.cy.mybatis_springboot.mapper.TestMapper;
import com.cy.mybatis_springboot.pojo.Account;
import com.cy.mybatis_springboot.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestMapper testMapper;

    @Resource
    private StudentMapper studentMapper;

    @GetMapping("/{id}")
    public Account selectAccountById(@PathVariable("id") int id) {
        return testMapper.selectAccountById(id);
    }

    @GetMapping("stu/{id}")
    public Student queryStudentById(@PathVariable("id") int id) {
        return studentMapper.queryStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }
}
