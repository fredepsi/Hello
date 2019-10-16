package com.frederic.citest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
    {
    @RequestMapping("/")
    public String index(@RequestParam(value = "name", required = false) String name)
        {
        if (name == null)
            return "Hello world";
        else
            return "Hello " + name;
        }
    }
