package com.service.notification.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

    @NotNull(message = "email is required")
    @Email(message = "please enter valid email")
    private String email;

    @NotNull(message = "password is required")
    private String password;
}
