package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    //user dashBoard
    @RequestMapping(value = "/dashboard",method = RequestMethod.GET)
    public String requestMethodName(){
        return "user/dashboard";

}
