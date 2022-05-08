package com.clay.security04.controller;

import javax.annotation.Resource;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clay.security04.param.LoginParam;

/**
 * @author lei
 */
@RestController
public class AuthController {

    @Resource
    private AuthenticationManager authenticationManager;

    @PostMapping("/auth/login")
    public String login(@RequestBody LoginParam param) {
        try {
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(param.getUsername(), param.getPassword());
            authenticationManager.authenticate(authenticationToken);
            return (String) authenticationToken.getPrincipal();
        } catch (AuthenticationException e) {
            return e.getMessage();
        }
    }
}
