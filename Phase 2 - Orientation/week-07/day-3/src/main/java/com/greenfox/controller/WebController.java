package com.greenfox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    Printer myPrinter;
    UtilityService service;

    @Autowired
    public WebController(Printer myPrinter, UtilityService service) {
        this.myPrinter = myPrinter;
        this.service = service;
    }

    @RequestMapping("/useful")
    public String useful (){
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String colored (Model model){
        model.addAttribute("randColor", service.randomColor());
        return "colored";
    }

    @RequestMapping("/useful/email")
    public String email (Model model, @RequestParam String email){
        model.addAttribute("isValidEmail", service.validateEmail(email));
        model.addAttribute("inputEmail" , email);
        return "email";
    }

}
