package com.lang.zipkinhi;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ZipkinHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinHiApplication.class, args);
    }

    private static final Logger logger = LoggerFactory.getLogger(ZipkinHiApplication.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
        logger.info("calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8989/hi", String.class);
    }

    @RequestMapping("/info")
    public String info(){
        logger.info("calling trace Zipkin-hi");
        return "I'm Zipkin-hi";
    }

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
