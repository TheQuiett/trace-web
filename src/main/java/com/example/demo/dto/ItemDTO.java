package com.example.demo.dto;

import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data()
public class ItemDTO {
    public String id;

    public String itemName;

    public String itemType;

    public OffsetDateTime createDate;

    public OffsetDateTime editDate;

    public String accountId;
}
