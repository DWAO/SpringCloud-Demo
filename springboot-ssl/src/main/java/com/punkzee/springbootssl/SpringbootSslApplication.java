package com.punkzee.springbootssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication
@Controller
public class SpringbootSslApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSslApplication.class, args);
    }


}
