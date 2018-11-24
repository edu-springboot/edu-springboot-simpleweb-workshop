package com.nhnent.edu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("message", "Welcome to the world!");
        return "welcome";
    }
}
