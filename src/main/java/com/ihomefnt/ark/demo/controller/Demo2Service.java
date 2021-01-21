package com.ihomefnt.ark.demo.controller;

//import com.alibaba.dubbo.config.annotation.Service;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.ihomefnt.ark.inter.Demo2Interface;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;

@Service
@SofaService
public class Demo2Service implements Demo2Interface {

    public String init(){
        return "demo2 version222222";
    }

}
