package com.sahan.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/indexController")
public class IndexController {

    @RequestMapping(value = "/index")
    private String index() {
        return "Hello Sahan!!";
    }
}
