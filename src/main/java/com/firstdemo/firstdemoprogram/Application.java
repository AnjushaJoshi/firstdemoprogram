package com.firstdemo.firstdemoprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String args[])
    {
        SpringApplication.run(Application.class,args);
    }
}
