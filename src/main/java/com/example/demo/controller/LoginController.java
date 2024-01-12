package com.example.demo.controller;

import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class LoginController {
    AccountRepository accountRepository;

    LoginController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    /**
     * 메인화면으로 이동
     * @return
     */
    public static String mainFrame(){

        return "";
    }

    public String createAccount(){



        return "";
    }


    /**
     * 로그인 페이지 호출
     * @param dto
     * @return
     */
    @PostMapping("login")
    public boolean login(@RequestBody LoginDTO dto) {
        //사용자 id 조회;
        List<Account> list = this.accountRepository.findAccountByUsernameContaining(dto.username);

        var acc = new Account();

        acc.setUsername("");
        acc.setPassword("");

        this.accountRepository.save(acc);
        return true;
    }
}
