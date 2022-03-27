package com.example.cartproduct.service;

import com.example.cartproduct.domain.Cart;
import com.example.cartproduct.domain.CartProduct;
import com.example.cartproduct.repository.ICartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    ICartRepository cartRepository;

    public Cart findCartByName(String name) {
        return cartRepository.findCartByName(name);
    }
//
//    public void deleteCart(Cart cart) {
//        cartRepository.delete(cart);
//    }

    public void deleteCart(String name) {
        cartRepository.deleteCartByName(name);
    }

    public List<Cart> findAllByCartName(List names){
        return cartRepository.findAllByCartName(names);
    }
}
