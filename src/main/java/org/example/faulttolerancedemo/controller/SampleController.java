package org.example.faulttolerancedemo.controller;

import org.example.faulttolerancedemo.service.ThirdPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController
{
    @Autowired
    private ThirdPartyService thirdPartyService;

     @GetMapping("/call")
    public String testCall(){

    return thirdPartyService.callThirdPartyAPI();
     }

}
