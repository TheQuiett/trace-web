package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Builder
@Data
@AllArgsConstructor
public class JwtTokenDTO {
    public String grantType;

    public String accessToken;

    public String refreshToken;
}
