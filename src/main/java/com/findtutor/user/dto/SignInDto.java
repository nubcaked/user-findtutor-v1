package com.findtutor.user.dto;

import lombok.Data;

@Data
public class SignInDto {
    private String usernameOrEmail;
    private String password;
}
