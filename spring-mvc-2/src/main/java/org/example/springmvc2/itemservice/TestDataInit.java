package org.example.springmvc2.itemservice;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.example.springmvc2.itemservice.domain.item.Item;
import org.example.springmvc2.itemservice.domain.item.ItemRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));
    }

}