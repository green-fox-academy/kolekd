package com.greenfox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Random;

@Service
public class Printer {

    Random rand = new Random();

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }

    public String getRandLineOf6(){
        Integer rand6 = 0;
        rand6 = (int)(Math.random() * ((999999 - 100000) + 1)) + 100000;
        return "#" + rand6.toString();
    }

}