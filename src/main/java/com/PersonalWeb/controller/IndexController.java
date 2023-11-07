package com.PersonalWeb.controller;

import com.PersonalWeb.entity.User;
import com.PersonalWeb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private IUserService userService;

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        for (User user : userService.list()) {
            System.out.println(user.getUserName());
        }
        return "Hello World!";
    }
}
