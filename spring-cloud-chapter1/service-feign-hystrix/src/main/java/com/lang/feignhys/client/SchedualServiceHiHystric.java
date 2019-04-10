package com.lang.feignhys.client;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServcieHi {
    @Override
    public String sayHiFromClientOne(String name){
        return "sorry"+name;
    }
}
