package com.example.demo.repository;

import com.example.demo.entity.Account;
import com.example.demo.entity.Item;
import com.example.demo.vo.ItemVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
    List<Item> findByAccount_Id(UUID accountId);

    List<Item> findBy();
}