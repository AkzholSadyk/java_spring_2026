package com.example.Spring2026.controller;

import com.example.Spring2026.model.Item;
import com.example.Spring2026.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/api/items")
    public Item create(@RequestBody Item item) {
        return itemService.create(item);
    }

    @GetMapping("/api/items")
    public List<Item> getAll() {
        return itemService.findAll();
    }
}
