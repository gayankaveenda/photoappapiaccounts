package com.developer.photoappapiaccountmanagement.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    private Environment environment;

    @GetMapping("/status/check")
    public String getStatus() {
        return "AccountsController working at port " + environment.getProperty("local.server.port");
    }
}
