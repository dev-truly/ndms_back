package com.satech.ndms.controller;

import com.satech.ndms.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    @Autowired
    AuthService authService;

    @ResponseBody
    @GetMapping("/test")
    public String test(HttpServletRequest req) {
        return authService.getAuthKey(req);
    }
}
