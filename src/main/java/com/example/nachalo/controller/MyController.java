package com.example.nachalo.controller;


import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @GetMapping ("/")
    public String home(Model model) {

        return "home";
    }
    @GetMapping ("/chat")
    public String chat() {
        return "chat";
    }
}
