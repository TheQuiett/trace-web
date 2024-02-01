package com.example.demo.controller;

import com.example.demo.dto.AccountDTO;
import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;
import com.example.demo.service.impl.AccountServiceImpl;
import com.example.demo.util.CommonUtils;
import com.example.demo.vo.AccountVO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController()
@AllArgsConstructor()
public class LoginController {
    final AccountRepository accountRepository;
    final AccountService accountService;

    /**
     * 압력된 사용자 정보를 통해서 계정존재여부를 확인한다.
     * @param dto
     * @return
     */
    @PostMapping("/checkLogin")
    public AccountVO checkLogin(@RequestBody LoginDTO dto) {

        //사용자 id 조회;
        //optional 사용 시 : 하나의 결과만 가져올 시 사용
        Optional<Account> resultAccount = this.accountRepository.findFirstByUserIdEquals(dto.userId);

        var accountVO = new AccountVO();

        if(resultAccount.isPresent()){
            Account tempAccount = resultAccount.get();

            accountVO = AccountVO.fromEntity(tempAccount);
        }

        return accountVO;
    }
}
