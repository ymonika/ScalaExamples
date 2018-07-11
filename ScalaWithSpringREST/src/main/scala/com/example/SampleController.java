package com.example;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping(value = "/hello")
public class SampleController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
