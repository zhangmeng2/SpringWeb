package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/test")
    public String testf() {
    	System.out.println("hello world!");
    	return "hello world!";
    }
}