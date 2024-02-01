package com.example.demo.vo;

import com.example.demo.entity.Account;
import com.example.demo.entity.Item;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data()
public class ItemVO {

    public UUID id;

    public String itemName;

    public String itemType;

    public OffsetDateTime createDate;

    public OffsetDateTime editDate;

    public static ItemVO fromEntity(Item entity) {
        var vo = new ItemVO();
        vo.setId(entity.getId());
        vo.setItemName(entity.getItemName());
        vo.setItemType(entity.getItemType());
        return vo;
    }
}