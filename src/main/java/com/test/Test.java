package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.HelloService;
import com.serviceimp.HelloServiceImpl;

@Component
public class Test {
	
	@Autowired
    private HelloService HelloServiceImpl;
    
    public void MessagePrinter() {
    	System.out.println(HelloServiceImpl.getMessage());
    	HelloServiceImpl servicImp=new HelloServiceImpl();
    	System.out.println(servicImp.getMessage2());
    }
    }
    
    
