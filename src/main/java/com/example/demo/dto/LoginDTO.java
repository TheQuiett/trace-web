package com.example.demo.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data()
public class LoginDTO {
    //유효성 검사,정귝식도 추가 가능
//    @Length(min = 3, max = 20, message = "패스워드 길이가 유효하지 않습니다.")
    public String userId;
    public String userName;
    public String userPassword;

}
