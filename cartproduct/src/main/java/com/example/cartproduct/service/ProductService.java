package com.example.cartproduct.service;

import com.example.cartproduct.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductRepository productRepository;
}
