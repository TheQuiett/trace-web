package com.example.demo.service;

import com.example.demo.dto.AccountDTO;
import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Account;
import com.example.demo.vo.AccountVO;
import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    @Transactional(rollbackFor = Exception.class)
    AccountVO createAccount(AccountDTO dto);
}
