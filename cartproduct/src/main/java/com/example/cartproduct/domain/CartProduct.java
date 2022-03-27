package com.example.cartproduct.domain;

import javax.persistence.*;

@Entity
@Table(name = "product_cart")
public class CartProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_cart_id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
//    @MapsId("cartName")
    @JoinColumn(name = "cart_name")
    private Cart cart;

    @ManyToOne(fetch = FetchType.EAGER)
//    @MapsId("id")
    @JoinColumn(name = "product_id")
    private Product product;

    public CartProduct() {
    }

    public CartProduct(int id, Cart cart, Product product) {
        this.id = id;
        this.cart = cart;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartProduct{" +
                "id=" + id +
                ", cart=" + cart +
                ", product=" + product +
                '}';
    }
}
