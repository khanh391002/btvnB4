package com.example.cartproduct.repository;

import com.example.cartproduct.domain.Cart;
import com.example.cartproduct.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, String> {
    @Query("SELECT p FROM Product p WHERE p.id IN (:ids)")
    List<Cart> findAllByCartName(@Param("ids") List ids);
}
