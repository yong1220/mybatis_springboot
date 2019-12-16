package com.cy.mybatis_springboot.service.imp;

import com.cy.mybatis_springboot.mapper.StudentMapper;
import com.cy.mybatis_springboot.pojo.Student;
import com.cy.mybatis_springboot.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int deleteStudentById(int id) {
        return studentMapper.deleteStudent(id);
    }

    @Override
    //多次对表进行操作所以加上@Transactional ---> 要么都成功 要么都失败
    @Transactional
    public Student updateStudent(int id, String name, int age) {
        //修改之前先做查询看是否存在该学生
        if (null == studentMapper.queryStudentById(id)) {
            return null;
        }
        studentMapper.updateStudent(id, name, age);
        //返回修改后的学生信息
        return studentMapper.queryStudentById(id);
    }

    @Override
    public Student queryStudentById(int id) {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }
}
