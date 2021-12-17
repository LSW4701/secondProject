package com.example.secondProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/hi")
    public String nicemeetyou(Model model){
        model.addAttribute("username","LSW");
        return "greeting";
    }
}
