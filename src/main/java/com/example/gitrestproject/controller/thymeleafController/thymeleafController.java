package com.example.gitrestproject.controller.thymeleafController;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class thymeleafController {

    @RequestMapping(path = "/hello")
    public String showmessage(Model model){
        model.addAttribute("message","hello to thymeleafe Template");
        return "hello";
    }
}
