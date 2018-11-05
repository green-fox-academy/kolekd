package com.greenfox.controllers;

import com.greenfox.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong numberInit = new AtomicLong(0);

    @RequestMapping
    public Greeting greeting(@RequestParam("name") String name, AtomicLong number){
        return new Greeting(numberInit.incrementAndGet(),"Hello, " + name);
    }

}
