package cn.example.platform.data.web.service;

import cn.example.platform.data.web.greeting.Greeting;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GreetingService {
    public String greeting(String username) throws IOException {
        try (Greeting greeting = new Greeting(username)) {
            greeting.open();
            return greeting.call();
        }
    }
}
