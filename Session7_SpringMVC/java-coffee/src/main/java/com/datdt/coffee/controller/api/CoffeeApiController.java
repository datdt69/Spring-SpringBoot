package com.datdt.coffee.controller.api;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoffeeApiController {
    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }
}
