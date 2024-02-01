package com.example.demo.controller;

import com.example.demo.dto.AccountDTO;
import com.example.demo.dto.ItemDTO;
import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.AccountService;
import com.example.demo.service.ItemService;
import com.example.demo.vo.AccountVO;
import com.example.demo.vo.ItemVO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@AllArgsConstructor()
public class ItemController {

    final ItemService itemService;
    final ItemRepository itemRepository;
    /**
     * 사용자 정보를 저장한다.
     * @param dto
     * @return
     */
    @PostMapping("/item/getItemList")
    public List<ItemVO> getItemList(@RequestBody ItemDTO dto) {
        List<ItemVO> itemList = itemService.getItemList(dto);
        return itemList;
    }

    @PostMapping("/item/getItemDetailData")
    public ItemVO getItemDetailData(@RequestBody ItemDTO dto) {
        ItemVO itemVO = itemService.getItemDetailData(dto);
        return itemVO;
    }

    @PostMapping("/item/mergeItem")
    public ItemVO mergeItem(@RequestBody ItemDTO dto) {
        ItemVO itemVO = itemService.mregeItem(dto);
        return itemVO;
    }
}
