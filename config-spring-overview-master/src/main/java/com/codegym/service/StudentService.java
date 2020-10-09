package com.codegym.service;

import com.codegym.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    private static List<Student> students = new ArrayList<>();
    static {
        Student student = new Student(1L, "Lâm", "Cổ Nhuế");
        Student student2 = new Student(2L, "Lâm2", "Cổ Nhuế");
        Student student3 = new Student(3L, "Lâm3", "Cổ Nhuế");
        Student student4 = new Student(4L, "Lâm4", "Cổ Nhuế");
        Student student5 = new Student(5L, "Lâm5", "Cổ Nhuế");
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public Student findById(Integer id) {
        return students.get(id);
    }

    @Override
    public Boolean editStudent(Integer id, Student student) {
        return null;
    }

    @Override
    public Boolean deleteStudent(Integer id) {
        return null;
    }

    @Override
    public Boolean addStudent(Student student) {
        students.add(student);
        return true;
    }
}
