package com.cy.mybatis_springboot.controller;

import com.cy.mybatis_springboot.pojo.Student;
import com.cy.mybatis_springboot.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    /**
     * 新增学生
     *
     * @param student
     * @return
     */
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        if (studentService.addStudent(student) < 1) {
            return "新增学生失败";
        }
        return "新增学生成功";
    }

    /**
     * 根据id删除学生
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable("id") int id) {
        if (studentService.deleteStudentById(id) < 1) {
            return "删除学生失败";
        }
        return "删除学生成功";
    }

    /**
     * 修改学生信息
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable("id") int id, @RequestParam("name") String name, @RequestParam("age") int age) {
        return studentService.updateStudent(id, name, age);
    }

    /**
     * 根据id查询学生
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Student queryStudentById(@PathVariable("id") int id) {
        return studentService.queryStudentById(id);
    }

    /**
     * 查询所有学生
     *
     * @return
     */
    @GetMapping("/all")
    public List<Student> queryAllStudent() {
        return studentService.queryAllStudent();
    }


}
