package com.lang.servicefeign.web;

import com.lang.servicefeign.client.SchedualServcieHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    //编译器报错，无视。因为这个Bean是在程序启动的时候自动注入的，编译器感知不到
    @Autowired
    SchedualServcieHi schedualServcieHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schedualServcieHi.sayHiFromClientOne(name);
    }
}
