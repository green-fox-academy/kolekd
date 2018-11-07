package com.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer implements CommandLineRunner {

    @Autowired
    Printer myLog;

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }

    @Override
    public void run(String... args) throws Exception {
        myLog.log("fuck YOU");
    }
}