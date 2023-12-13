package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    // 상품등록
    @Transactional
    public void save(Item item){
        itemRepository.save(item);
    }

    // 상품조회
    public List<Item> findItems(){
        return itemRepository.findAll();
    }

    public Item findOne(Long id){
        return itemRepository.findOne(id);
    }

}
