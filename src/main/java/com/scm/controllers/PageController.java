package com.scm.controllers;

import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.helpers.MessageType;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processRegister(@Valid @ModelAttribute UserForm userForm, BindingResult rBindingResult,
                                  HttpSession session) {
        System.out.println("Processing registration");
        // fetch form data
        // UserForm
        System.out.println(userForm);

        // validate form data
        if (rBindingResult.hasErrors()) {
            return "register";
        }





//        User user = new User();
//        user.setName(userForm.getName());
//        user.setEmail(userForm.getEmail());
//        user.setPassword(userForm.getPassword());
//        user.setAbout(userForm.getAbout());
//        user.setPhoneNumber(userForm.getPhoneNumber());
//        user.setEnabled(false);
//        user.setProfilePic(
//                "");
//
//        User savedUser = userService.saveUser(user);

        System.out.println("user saved :");

        // message = "Registration Successful"

        // add the message:

        Message message = Message.builder().content("Registration Successful").type(MessageType.green).build();

        session.setAttribute("message", message);

        // redirectto login page
        return "redirect:/register";
    }





}
