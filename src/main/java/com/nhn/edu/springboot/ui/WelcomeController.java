package com.nhn.edu.springboot.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(@RequestParam("name") String name,
                          Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }
}
