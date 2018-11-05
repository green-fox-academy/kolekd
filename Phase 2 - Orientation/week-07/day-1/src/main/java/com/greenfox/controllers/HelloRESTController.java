package com.greenfox.controllers;

import com.greenfox.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong numberInit = new AtomicLong(0);

    @RequestMapping
    public Greeting greeting(@RequestParam("name") String name){
        return new Greeting(numberInit.incrementAndGet(),"Hello, " + name);
    }

    public String getName(@RequestParam("name") String name){
        return name;
    }

    public long getCount(){
        return numberInit.incrementAndGet();
    }

}
