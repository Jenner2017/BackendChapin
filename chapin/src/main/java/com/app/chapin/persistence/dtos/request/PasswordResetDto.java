package com.app.chapin.persistence.dtos.request;

import lombok.Data;

@Data
public class PasswordResetDto {
    private String token;
    private String newPassword;
}