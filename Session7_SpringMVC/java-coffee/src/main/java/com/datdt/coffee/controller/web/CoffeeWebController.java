package com.datdt.coffee.controller.web;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class CoffeeWebController {
    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }
}
