package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    public String home(Model model){
        List<Student> list = studentService.findAll();
        model.addAttribute("list",list);
        return "/home";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("student", new Student());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Student student, RedirectAttributes redirect){
        studentService.save(student);
        redirect.addFlashAttribute("success","add oke");
        return "redirect:/students";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("student", studentService.findById(id));
        return "/edit";
    }

    @PostMapping("/{id}/edit")
    public String edit(Student student, RedirectAttributes redirect){
        studentService.update(student.getId(),student);
        redirect.addFlashAttribute("success","sua oke");
        return  "redirect:/students";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("student", studentService.findById(id));
        return "/delete";
    }
    @PostMapping("/{id}/delete")
    public String delete(Student student, RedirectAttributes redirect){
        studentService.remove(student.getId());
        redirect.addFlashAttribute("success","xóa oke");
        return  "redirect:/students";
    }
}
