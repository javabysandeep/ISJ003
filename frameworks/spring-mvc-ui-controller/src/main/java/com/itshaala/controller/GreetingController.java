package com.itshaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greet() {
        return "greet";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("username", username);
        modelAndView.addObject("password", password);
        return modelAndView;
    }

    @RequestMapping(value = "/hi/{username}", method = RequestMethod.GET)
    public ModelAndView hi(@PathVariable("username") String username) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hi");
        modelAndView.addObject("username",username);
        return modelAndView;
    }
}
