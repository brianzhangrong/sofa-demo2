package com.ihomefnt.ark.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {

    @GetMapping(path="/testResult2")
    public String testResult(){
        return "demo2 testResult ok";
    }
}
