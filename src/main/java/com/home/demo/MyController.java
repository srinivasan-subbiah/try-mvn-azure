package com.home.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping("/hello/{name}")
    public ModelAndView sayHello(@PathVariable String name){
        ModelAndView mv=new ModelAndView("Greetings");
        mv.getModelMap().put("name", name);
        return mv;
    }
}
