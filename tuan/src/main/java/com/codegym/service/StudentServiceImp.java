package com.codegym.service;

import com.codegym.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImp implements IStudentService{
    private static List<Student> list = new ArrayList<>();
    static {
        list.add(new Student(1,"A","HN"));
        list.add(new Student(2,"B","QN"));
        list.add(new Student(3,"C","TB"));
        list.add(new Student(4,"D","HP"));
        list.add(new Student(5,"E","ĐN"));
    }

    @Override
    public List<Student> findAll() {
        return list;
    }

    @Override
    public Student findById(int id) {
        Student student1 = null;
        for (Student student: list){
            if ((id-1) == student.getId()){
                student1= student;
            }
        }
        return student1;
    }

    @Override
    public void save(Student student) {
        list.add(student);
    }

    @Override
    public void update(int id, Student student) {
        list.set(id,student);
    }

    @Override
    public void remove(int id) {
        list.remove(id);
    }
}
