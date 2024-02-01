package com.example.demo.vo;

import com.example.demo.entity.Account;
import lombok.Data;

import java.util.UUID;

@Data()
public class AccountVO {
    public UUID id;
    public String userId;
    public String userName;
    public String userAddress;
    public String lastLoginDate;

    public static AccountVO fromEntity(Account entity) {
        var vo = new AccountVO();
        vo.setId(entity.getId());
        vo.setUserId(entity.getUserId());
        vo.setUserName(entity.getUserName());
        vo.setUserAddress(entity.getUserAddress());
        return vo;
    }
}