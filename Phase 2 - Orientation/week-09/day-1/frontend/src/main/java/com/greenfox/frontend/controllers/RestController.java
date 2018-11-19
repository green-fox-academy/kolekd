package com.greenfox.frontend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    public HashMap<String, Object> doubling(@RequestParam (required = false) Integer input){
        HashMap<String, Object> response = new HashMap<>();

        if (input != null) {
            int result = input * 2;

            response.put("received", input);
            response.put("result", result);
        } else {
            response.put("error", "Please provide an input!");
        }
        return response;
    }

    @GetMapping("/greeter")
    public HashMap<String, String> greeter (@RequestParam (required = false) String name,
                                            @RequestParam (required = false) String title){

        HashMap<String, String> response = new HashMap<>();

        System.out.println("Name: " + name + "  Title: " + title);

        if (name.length() < 1 && title.length() < 1){
            response.put("error", "Please provide a name and a title!");
        } else if (name.length() < 1){
            response.put("error", "Please provide a name!");
        } else if (title.length() < 1){
            response.put("error", "Please provide a title!");
        } else {
            response.put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
        }
        return response;
    }



}
