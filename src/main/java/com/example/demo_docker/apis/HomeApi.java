package com.example.demo_docker.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apis")
public class HomeApi {

    @GetMapping("/hello-world")
    public String getHelloWorld(){
        return "Hello World";
    }

}
