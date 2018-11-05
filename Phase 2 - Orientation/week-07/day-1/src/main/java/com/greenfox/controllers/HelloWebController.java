package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

    HelloRESTController rest = new HelloRESTController();

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("font", rest.getFont());
        model.addAttribute("size", rest.getRand25to50());
        model.addAttribute("colour", rest.getRandLineOf6());
        model.addAttribute("hello", hellos[rest.get1to50()]);
        model.addAttribute("name", rest.getName("Daniel"));
        model.addAttribute("number", rest.getCount());
        return "greeting";
    }

}
