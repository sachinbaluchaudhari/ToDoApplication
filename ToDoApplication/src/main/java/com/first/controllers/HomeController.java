package com.first.controllers;

import com.first.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @Value("${com.profile.sachinImage.path}")
    private String profilePath;
    @Autowired
    private SecurityConfig securityConfig;
    @RequestMapping("/toDos")
    public List<String> justTesting()
    {

        List<String> toDos= Arrays.asList("learn Java",
                "learn Spring",
                "learn Spring Boot",
                "learn Mysql",
                "Do one project");
        return toDos;
    }
    @RequestMapping("profile-path")
    public String getProfilePath()
    {
        return this.profilePath;
    }
    @RequestMapping("/security-config")
    public SecurityConfig securityConfig()
    {
        return this.securityConfig;
    }
}
