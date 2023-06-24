package com.spinmax.auth.security;

import lombok.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {
    @Value("${jwt.secret}")
    private String secret;
}
