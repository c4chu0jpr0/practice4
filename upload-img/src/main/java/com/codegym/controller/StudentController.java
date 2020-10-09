package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.model.StudentForm;
import com.codegym.service.student.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private Environment environment;

    @Autowired
    private IStudentService studentService;

    @GetMapping()
    public String index(Model model){
        model.addAttribute("list",studentService.findAll());
        return "/list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
    model.addAttribute("student",new StudentForm());
    return "/create";
    }
    @PostMapping("/create")
    public String createStudent(StudentForm studentForm,Model model){
        Student student= new Student(studentForm.getName(),studentForm.getAddress());
        MultipartFile file= studentForm.getImage();
        String image =file.getOriginalFilename();
        student.setImage(image);
        String fileUpload =environment.getProperty("file_upload").toString();

        try {
            FileCopyUtils.copy(file.getBytes(),new File( fileUpload +image));
        } catch (IOException e) {
            e.printStackTrace();
        }
        studentService.save(student);
        model.addAttribute("student",new StudentForm());
        return "/create";
    }


}
