package com.co.kr.authorization.authorization.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerStatusController {
    @GetMapping("/status")
    public ResponseEntity<Object> serverStatus() {
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
