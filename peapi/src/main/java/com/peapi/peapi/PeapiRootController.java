package com.peapi.peapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeapiRootController {

    @RequestMapping
    public String home(){
        return "Generic root page";
    }
    

}