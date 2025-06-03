package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    //about route

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("ABout page");
        return "about";
    }


    //service

    @RequestMapping("/service")
    public String service(){
        System.out.println("ABout service");
        return "services";
    }


}
