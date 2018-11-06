package com.greenfox.controller;

import com.greenfox.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

    BankAccount simba = new BankAccount("Simba", 2000, "lion", false);
    BankAccount mufasa = new BankAccount("Mufasa", 200000, "lion", true);
    BankAccount ed = new BankAccount("Ed", 10, "hyena", false);
    BankAccount zazu = new BankAccount("Zazu", 3400, "parrot", false);
    BankAccount shenzi = new BankAccount("Shenzi", 34, "hyena", false);
    List<BankAccount> list = new ArrayList<>();

    public WebController(){
        list.add(simba); list.add(mufasa); list.add(ed); list.add(zazu); list.add(shenzi);
    }

    @RequestMapping("/show")
    public String show (Model model){
        model.addAttribute("name", simba.getName());
        model.addAttribute("balance", simba.getBalance());
        model.addAttribute("animalType", simba.getAnimalType());
        return "show";
    }

    @RequestMapping("/list")
    public String list (Model model){
        model.addAttribute("accList", list);
        return "list";
    }

}
