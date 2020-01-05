package com.springboottest.startup;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.springboottest"})
public class SpringBootTestApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }

    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder){
        System.out.println("--------==========INITIALISING SPRINGBOOT=========----------------");
        return builder.sources(SpringBootTestApplication.class);
    }

    public static void main(String[] args) {
//        configureApplication(new SpringApplicationBuilder()).run(args);
    }
}
