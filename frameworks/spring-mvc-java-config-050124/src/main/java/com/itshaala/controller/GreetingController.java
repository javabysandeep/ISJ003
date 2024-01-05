package com.itshaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GreetingController {
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ModelAndView greeting() {
        ModelAndView modelAndView = new ModelAndView();
        List<String> greetings = List.of("Good morning", "Good evening", "Good afternoon", "Namaste", "Dhanywad");
        modelAndView.setViewName("greet");
        modelAndView.addObject("data", greetings);
        return modelAndView;
    }
}
