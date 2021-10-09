package hr.algebra.lab1.controller;

import hr.algebra.lab1.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(Student student){
        return "hello-world";
    }

    @PostMapping
    public String helloWorldProcessed(String name){
        return "hello-world-processed";
    }
}
