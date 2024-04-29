package com.copilot.booking.car.api.controller;

import com.copilot.booking.car.api.dto.StatusOperation;
import com.copilot.booking.car.api.service.UserLoginService;
import com.copilot.booking.car.api.dto.UserLoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @PostMapping
    public ResponseEntity<StatusOperation> login(@RequestBody UserLoginDTO userLoginDTO) {
        return ResponseEntity.ok(userLoginService.login(userLoginDTO));
    }
}