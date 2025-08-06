package kr.co.wikibook.gallery.cart.controller;

import kr.co.wikibook.gallery.account.helper.AccountHelper;
import kr.co.wikibook.gallery.cart.service.CartService;
import kr.co.wikibook.gallery.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    private final ItemService itemService;
    private final AccountHelper accountHelper;


}
