package com.greenfox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @GetMapping(value="")
    @ResponseBody
    public String index (){
        return "You didn't add an endpoint, nub.";
    }

    @GetMapping(value="/enjoy")
    @ResponseBody
    public String enjoy (){
        return "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    }
}