package com.thebeast.theglory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thefake.thelib.HelloControllerWrapper;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/")
    public String helloJarLib() {
        return HelloControllerWrapper.sayHello();
    }
}
