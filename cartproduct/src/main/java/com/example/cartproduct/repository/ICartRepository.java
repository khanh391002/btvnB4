package com.example.cartproduct.repository;

import com.example.cartproduct.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICartRepository extends JpaRepository<Cart, String> {
    @Query("DELETE FROM Cart c WHERE c.cartName =:name")
    void deleteCartByName(@Param("name") String name);

    @Query("SELECT c FROM Cart c WHERE c.cartName =:name")
    Cart findCartByName(@Param("name") String cartName);

    @Query("SELECT c FROM Cart c WHERE c.cartName IN (:names)")
    List<Cart> findAllByCartName(@Param("names") List names);
}
