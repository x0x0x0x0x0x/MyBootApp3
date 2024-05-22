package com.example.demo;
//import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* Hello world!
*/
@Controller
public class HelloController
{
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("msg","this is a setting message");
        return "index";
    }
}