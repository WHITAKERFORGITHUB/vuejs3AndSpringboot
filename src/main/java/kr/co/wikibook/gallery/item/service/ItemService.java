package kr.co.wikibook.gallery.item.service;

import kr.co.wikibook.gallery.item.dto.ItemRead;

import java.util.List;

public interface ItemService {
    List<ItemRead> findAll();
    List<ItemRead> findAll(List<Integer> ids);
}
