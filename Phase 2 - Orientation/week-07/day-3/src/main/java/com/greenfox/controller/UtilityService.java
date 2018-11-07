package com.greenfox.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public boolean validateEmail (String email){
        return (email.contains("@") && email.contains(".")) ;
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }
}