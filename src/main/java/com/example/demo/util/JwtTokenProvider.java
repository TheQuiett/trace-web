package com.example.demo.util;

import jakarta.websocket.Decoder;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.DefaultMessageCodesResolver;

import java.security.Key;
import java.util.Base64;

@Slf4j
@Component
public class JwtTokenProvider {
    private final Key key;

    public JwtTokenProvider(@Value("${jwt.secret}") String secretKey) {

        Base64.Decoder decoder = Base64.getUrlDecoder();

        byte[] keyBytes = decoder.decode(secretKey);
        this.key = Keys.hmacShaKeyFor(keyBytes);
    }
}
