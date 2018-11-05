package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

    HelloRESTController rest = new HelloRESTController();

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", rest.getName("Daniel"));
        model.addAttribute("number", rest.getCount());
        return "greeting";
    }

}
