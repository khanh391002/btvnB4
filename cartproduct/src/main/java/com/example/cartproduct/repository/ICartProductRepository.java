package com.example.cartproduct.repository;

import com.example.cartproduct.domain.Cart;
import com.example.cartproduct.domain.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICartProductRepository extends JpaRepository<CartProduct, String> {
//    @Query("SELECT c FROM Cart c WHERE c.cartName =:name")
//    Cart findCartByName(@Param("name") String cartName);
//    @Query("SELECT c FROM Cart c WHERE c.cartName IN (:name)")
//    List<Cart> findAllByCartName(@Param("name") List name);

}
