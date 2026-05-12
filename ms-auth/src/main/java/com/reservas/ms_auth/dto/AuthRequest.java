package com.reservas.ms_auth.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
