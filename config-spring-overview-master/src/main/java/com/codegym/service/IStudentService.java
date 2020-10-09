package com.codegym.service;

import com.codegym.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student findById(Integer id);
    Boolean editStudent(Integer id, Student student);
    Boolean deleteStudent(Integer id);
    Boolean addStudent(Student student);
}
