package com.copilot.booking.car.api.dto;

import lombok.Data;

@Data
public class UserLoginDTO {
    private String userName;
    private String userPassword;
}