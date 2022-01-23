package com.javatechie.azure.demon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemonApplication {

    @GetMapping("/message")
    public String message(){
    return "Congrats ! Your application deployed successfully  in Azure platform";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemonApplication.class, args);
    }

}
