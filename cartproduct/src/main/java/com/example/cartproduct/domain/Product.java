package com.example.cartproduct.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name_product")
    private String name;
    @Column(name = "price")
    private int price;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<CartProduct> cartProductList = new ArrayList<>();

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<CartProduct> getCartProductList() {
        return cartProductList;
    }

    public void setCartProductList(List<CartProduct> cartProductList) {
        this.cartProductList = cartProductList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
