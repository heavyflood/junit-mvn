package com.example.junitmvn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/sample/test")
    public String test(){
        String msg = "OK";
        return msg;
    }

}
