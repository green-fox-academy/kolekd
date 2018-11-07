package com.greenfox;

import com.greenfox.Color.GreenColor;
import com.greenfox.Color.RedColor;
import com.greenfox.Color.MyColor;
import com.greenfox.controller.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Main implements CommandLineRunner {

    Printer myPrinter;
    MyColor myColor;

    @Autowired
    public Main(Printer myPrinter, MyColor myColor){
        this.myPrinter = myPrinter;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Override
    public void run(String... args) throws Exception {
        myPrinter.log("hello");
        myColor.printColor();
    }

}
