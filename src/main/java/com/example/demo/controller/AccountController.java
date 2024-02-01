package com.example.demo.controller;

import com.example.demo.dto.AccountDTO;
import com.example.demo.service.AccountService;
import com.example.demo.vo.AccountVO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@AllArgsConstructor()
public class AccountController {

    final AccountService accountService;

    /**
     * 사용자 정보를 저장한다.
     * @param dto
     * @return
     */
    @PostMapping("/createAccount")
    public AccountVO createAccount(@RequestBody AccountDTO dto) {
        AccountVO accountVO = accountService.createAccount(dto);
        return accountVO;
    }
}
