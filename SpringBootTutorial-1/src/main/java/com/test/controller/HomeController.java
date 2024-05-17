package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/test")
public class HomeController {


	@GetMapping("/")
    public String home(){
        return "Hello World!";
    }
}