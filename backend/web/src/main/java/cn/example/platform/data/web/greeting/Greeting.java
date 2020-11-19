package cn.example.platform.data.web.greeting;

import cn.example.platform.data.common.Configurable;

import javax.annotation.PostConstruct;
import java.io.IOException;

public class Greeting implements Configurable<String> {
    private String username;

    public Greeting(String username) {
        this.username = username;
    }

    @Override
    @PostConstruct
    public void open() throws IOException {
        System.out.println("opening...");
    }

    @Override
    public void close() throws IOException {
        System.out.println("closing...");
    }

    @Override
    public String call() {
        return String.format("hello %s", username);
    }
}
