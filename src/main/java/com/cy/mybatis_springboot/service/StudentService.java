package com.cy.mybatis_springboot.service;

import com.cy.mybatis_springboot.pojo.Student;

import java.util.List;

public interface StudentService {

    //新增学生
    int addStudent(Student student);

    //根据id删除学生
    int deleteStudentById(int id);

    //修改学生信息
    Student updateStudent(int id,String name,int age);

    //根据id来查询学生
    Student queryStudentById(int id);

    //查询所有学生
    List<Student> queryAllStudent();
}
