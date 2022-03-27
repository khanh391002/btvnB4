package com.example.cartproduct.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @Column(name = "cart_name")
    private String cartName;
    @Column(name = "id_cart")
    private int cartId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cart", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<CartProduct> cartProductList = new ArrayList<>();

    public Cart() {
    }

    public Cart(String cartName, int cartId) {
        this.cartName = cartName;
        this.cartId = cartId;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<CartProduct> getCartProductList() {
        return cartProductList;
    }

    public void setCartProductList(List<CartProduct> cartProductList) {
        this.cartProductList = cartProductList;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartName='" + cartName + '\'' +
                ", cartId=" + cartId +
                '}';
    }
}
