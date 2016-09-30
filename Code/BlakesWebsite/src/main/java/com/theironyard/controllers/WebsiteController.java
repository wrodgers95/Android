package com.theironyard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class WebsiteController {

    @RequestMapping (path = "/", method = RequestMethod.GET)
    public static String index (HttpSession session) {

        return "index";
    }

}
