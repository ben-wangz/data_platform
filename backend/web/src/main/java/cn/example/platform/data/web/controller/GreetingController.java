package cn.example.platform.data.web.controller;

import cn.example.platform.data.web.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam("username") String username) throws IOException {
        return greetingService.greeting(username);
    }
}
