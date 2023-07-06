package com.sriahlc.sriahlcApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlerInicio {


    @GetMapping("/inicio")
    public String home(){
        return "prueba";
    }
}
