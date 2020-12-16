package com.co.kr.authorization.authorization.controller;

import com.co.kr.authorization.authorization.service.AuthorizationService;
import com.co.kr.authorization.authorization.vo.Authorization.register.AuthorizationRequestBodyVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authorization")
public class AuthorizationController {
    private final AuthorizationService authorizationService;

    public AuthorizationController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping("/register")
    public ResponseEntity<Object> Register(@RequestBody AuthorizationRequestBodyVo body) {
        return authorizationService.Register(body);
    }
}
