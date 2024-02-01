package com.example.demo.service.impl;

import com.example.demo.dto.AccountDTO;
import com.example.demo.dto.ItemDTO;
import com.example.demo.entity.Account;
import com.example.demo.entity.Item;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.AccountService;
import com.example.demo.service.ItemService;
import com.example.demo.vo.AccountVO;
import com.example.demo.vo.ItemVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final AccountRepository accountRepo;

    @Override
    public List<ItemVO> getItemList(ItemDTO dto) {
//        /**
//         * 저장 후 예외상황 발생시 처리하는 부분 추가필요.
//         */
        List<Item> itemList = this.itemRepository.findByAccount_Id(UUID.fromString(dto.accountId));

//        List<Item> itemList = this.itemRepository.findBy();

        // List<Item>을 List<ItemVO> 형태로 변환 한다.
        return itemList.stream().map(ItemVO::fromEntity).collect(Collectors.toList());
    }

    public ItemVO getItemDetailData(ItemDTO dto) {
        Optional<Item> itemOpt = this.itemRepository.findById(UUID.fromString(dto.id));

        ItemVO itemVO = new ItemVO();

        if(itemOpt.isPresent()){
            Item item = itemOpt.get();

            itemVO = ItemVO.fromEntity(item);
        }

        return itemVO;
    }

    public ItemVO mregeItem(ItemDTO dto) {
        var item = new Item();

        String accountId = dto.accountId;

        Optional<Account> accountOpt = this.accountRepo.findById(UUID.fromString(accountId));

        if(accountOpt.isPresent()){

            Account account = accountOpt.get();

            item.setAccount(account);
            item.setItemName(dto.itemName);
            item.setItemType(dto.itemType);

            this.itemRepository.save(item);
        }

        ItemVO itemVO = ItemVO.fromEntity(item);

        return itemVO;
    }
}