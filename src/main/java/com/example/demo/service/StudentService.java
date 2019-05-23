package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService{

    private Map<Long, Student> studentCache = new HashMap<>();
    private Long idCounter = 1L;

    public List<Student> getAllStudent(){
        return new ArrayList<>(studentCache.values()) ;
    }

    public Student saveStudent(Student student){
        student.setId(idCounter++);
        studentCache.put(student.getId(), student);
        return student;
    }
}
