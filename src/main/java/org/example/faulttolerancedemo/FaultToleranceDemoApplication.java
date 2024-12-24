package org.example.faulttolerancedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FaultToleranceDemoApplication {

    @Bean
    public RestTemplate restTemlate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(FaultToleranceDemoApplication.class, args);
    }

}
