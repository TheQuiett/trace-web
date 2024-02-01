package com.example.demo.service.impl;

import com.example.demo.dto.AccountDTO;
import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;
import com.example.demo.vo.AccountVO;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountVO createAccount(AccountDTO dto) {
//        /**
//         * 저장 후 예외상황 발생시 처리하는 부분 추가필요.
//         */
        var acc = new Account();

        acc.setUserId(dto.userId);
        acc.setUserName(dto.userName);
        acc.setUserPassword(dto.userPassword);
        acc.setUserAddress(dto.userAddress);

        this.accountRepository.save(acc);

        AccountVO accountVO = AccountVO.fromEntity(acc);

        return accountVO;
    }
}