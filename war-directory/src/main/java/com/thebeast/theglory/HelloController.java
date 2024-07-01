package com.thebeast.theglory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.thefake.thelib.HelloControllerWrapper;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello/{name}")
    public String helloJarLib(@PathVariable String name) {
        // HelloControllerWrapper.sayHello();
        return "Hi!" + name;
    }
}
