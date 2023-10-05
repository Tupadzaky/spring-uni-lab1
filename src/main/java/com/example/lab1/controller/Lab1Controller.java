package com.example.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Lab1Controller {
    @GetMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello world!";
    }

    @GetMapping("/vlad")
    String vlad() {
        return "vlad.html";
    }

    @GetMapping("/vanya")
    String vanya() {
        return "vanya.html";
    }

    @GetMapping("/lera1")
    String lera1() {
        return "lera1.html";
    }

    @GetMapping("/lera2")
    String lera2() {
        return "lera2.html";
    }
}
