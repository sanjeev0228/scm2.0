package com.scm.controllers;

import com.scm.forms.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @GetMapping("/login")
    public  String login(){
        return  new String("login");
    }

    @GetMapping("/register")
    public  String register(Model model){
        UserForm userForm = new UserForm();
        model.addAttribute("userForm",userForm);

        return "register";
    }

    //about route

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("ABout page");
        return "about";
    }


    //service

    @RequestMapping("/service")
    public String service(){
        System.out.println("about service");
        return "services";
    }

    @RequestMapping(value = "/do-register",method = RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm){
        System.out.println("Processing register");

        // redirect to login page
        return "redirect:/register";
    }





}
