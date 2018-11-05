package com.greenfox.controllers;

import com.greenfox.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong numberInit = new AtomicLong(0);
    int zero = 0;

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

    public int get1to50 () {
        if (zero > 48){
            zero = -1;
        }
        zero++;
        return zero;
    }

    public String getRandLineOf6(){
        Integer rand6 = 0;
        rand6 = (int)(Math.random() * ((999999 - 100000) + 1)) + 100000;
        return "#" + rand6.toString();
    }

    public String getRand25to50(){
        Integer rand1050 = 0;
        rand1050 = (int)(Math.random() * ((50 - 25) + 1)) + 25;
        return rand1050.toString();
    }

    public String getFont(){
        ArrayList<String> fonts = new ArrayList<>();
        fonts.add("Times New Roman");
        fonts.add("Verdana");
        fonts.add("Comic sans MS");
        fonts.add("WildWest");
        fonts.add("Bedrock");
        return fonts.get(getRand0toX(4));
    }

    public int getRand0toX(int x){
        return (int)(Math.random() * ((x - 0) + 1)) + 0;
    }

}
