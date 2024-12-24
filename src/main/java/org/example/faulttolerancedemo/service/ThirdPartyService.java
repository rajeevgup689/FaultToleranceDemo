package org.example.faulttolerancedemo.service;


import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ThirdPartyService {

    private static String URL = "http://localhost:8081/test/data";

      @Autowired
      private RestTemplate restTemplate;

   @Retry(name ="apiRetry", fallbackMethod = "fallbackResponse")
    public String callThirdPartyAPI(){

        return  restTemplate.getForObject(URL,String.class);
    }

    public String fallbackResponse(Throwable throwable){
        System.out.println("the reason for the fallback : -"+ throwable.getMessage());
     return "Fallback Response :- Unable to fetch the data";
}
}
