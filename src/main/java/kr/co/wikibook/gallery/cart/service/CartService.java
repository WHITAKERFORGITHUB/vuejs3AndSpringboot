package kr.co.wikibook.gallery.cart.service;

import kr.co.wikibook.gallery.cart.dto.CartRead;
import kr.co.wikibook.gallery.cart.entity.Cart;

import java.util.List;

public interface CartService {
    List<CartRead> findAll(Integer memberId);
    CartRead find(Integer memberId, Integer itemId);
    void removeAll(Integer memberId);
    void remove(Integer memberId, Integer itemId);
    void save(Cart cart);
}
