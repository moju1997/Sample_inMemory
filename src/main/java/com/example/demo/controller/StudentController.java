package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/students")
    public void saveStudent(@RequestBody  Student student){
        studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        List<Student> students=studentService.getAllStudent();
        return students;
    }
}
