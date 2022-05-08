package com.clay.security04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lei
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "hi";
    }
}
