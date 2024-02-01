package com.example.demo.service;

import com.example.demo.dto.AccountDTO;
import com.example.demo.dto.ItemDTO;
import com.example.demo.entity.Item;
import com.example.demo.vo.AccountVO;
import com.example.demo.vo.ItemVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ItemService {
    @Transactional(rollbackFor = Exception.class)
    List<ItemVO> getItemList(ItemDTO dto);

    @Transactional(rollbackFor = Exception.class)
    ItemVO getItemDetailData(ItemDTO dto);

    @Transactional(rollbackFor = Exception.class)
    ItemVO mregeItem(ItemDTO itemDTO);
}
