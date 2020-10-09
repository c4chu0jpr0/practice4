package com.codegym.service.student;

import com.codegym.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService implements IStudentService{
    private static Map<Integer, Student> listStudent;
    static {
        listStudent = new HashMap<>();
        listStudent.put(1, new Student(1, "Bao", "Thai Nguyen", "1.png"));
        listStudent.put(2, new Student(2,"Bao1", "Thai Nguyen1", "2.png"));
        listStudent.put(3, new Student(3,"Bao2", "Thai Nguyen2", "1.png"));
        listStudent.put(4, new Student(4,"Bao3", "Thai Nguyen3", "4.png"));
    }

    @Override
    public List<Student> findAll() {
        ArrayList list = new ArrayList<>(listStudent.values());
        return list;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void update(Student model) {

    }

    @Override
    public void save(Student model) {
        int stt = listStudent.size()+1;
        model.setId(stt);
        listStudent.put(stt,model);
    }

    @Override
    public void remove(Long id) {

    }
}
