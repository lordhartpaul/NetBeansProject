/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.controller;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController{
    
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello Worldddddddddddddddddddd ";
    }
    public static void main(String[] args) throws Exception{
        SpringApplication.run(SampleController.class, args);
    }
}
