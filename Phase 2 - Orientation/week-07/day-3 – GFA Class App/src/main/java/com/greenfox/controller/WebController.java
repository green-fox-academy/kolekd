package com.greenfox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    StudentService studentService;

    @Autowired
    public WebController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/gfa")
    public String gfa (){
        return "gfa";
    }

    @RequestMapping("/gfa/list")
    public String gfaList (Model model){
        model.addAttribute("studentList", studentService.findAll());
        return "list";
    }

}