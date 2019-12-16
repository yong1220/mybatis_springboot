package com.cy.mybatis_springboot.mapper;

import com.cy.mybatis_springboot.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {

    //新增学生
    int addStudent(Student student);

    //根据id删除学生
    int deleteStudent(@Param("id") int id);

    //修改学生信息
    int updateStudent(@Param("id")int id,@Param("name")String name,@Param("age")int age);

    //根据id来查询学生
    Student queryStudentById(@Param("id") int id);

    //查询所有学生
    List<Student> queryAllStudent();
}
