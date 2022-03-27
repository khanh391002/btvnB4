package com.example.cartproduct.service;

import com.example.cartproduct.domain.Cart;
import com.example.cartproduct.domain.CartProduct;
import com.example.cartproduct.repository.ICartProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartProductService {
    @Autowired
    ICartProductRepository cartProductRepository;

//    Cart findCartByName(String name){
//        return cartProductRepository.findCartByName(name);
//    }
//
//    void deleteCartByName(CartProduct cartProduct){
//        cartProductRepository.delete(cartProduct);
//    }
    public List<CartProduct> findAll(){
        return cartProductRepository.findAll();
    }

    public void deleteCart(CartProduct cartProduct){
        cartProductRepository.delete(cartProduct);
    }

}
