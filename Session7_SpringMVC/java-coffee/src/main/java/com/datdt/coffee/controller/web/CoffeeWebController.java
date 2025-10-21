package com.datdt.coffee.controller.web;

import com.datdt.coffee.entity.Coffee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoffeeWebController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("Coffee"," for developer");
        model.addAttribute("cup",new Coffee("1","coffee",15.5));
        return "index";
    }
}
