package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.ui.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")
public class HomeController {
    @Autowired
    private IStudentService studentService;

    @GetMapping(value = "")
    public String index(ModelMap model){
        List<Student> list = studentService.findAll();
        model.addAttribute("list", list);
        return "home";
    }

    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable Integer id){
        Student student = studentService.findById(id);
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView formCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("student", new Student());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createNewStudent(@RequestBody Student student, ModelMap modelMap){
        studentService.addStudent(student);
        List<Student> list = studentService.findAll();
        modelMap.addAttribute("list", list);
        return "home";
    }




//    @GetMapping("/detail/{id}")
//    public ModelAndView searchStudent(@PathVariable Long id, @RequestParam String name, String className){
//        ModelAndView modelAndView = new ModelAndView("search");
//        modelAndView.addObject("name", name);
//        modelAndView.addObject("id", id);
//        modelAndView.addObject("className", className);
//        return modelAndView;
//    }

//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String home(){
//        return "home";
//    }
}
