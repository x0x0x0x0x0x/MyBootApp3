package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* Hello world!
*/
@Controller
public class HelloController
{
    @RequestMapping("/")
    public String index(Model model) {
        //return "this is Spring Boot sample";
        return "index";
    }
}