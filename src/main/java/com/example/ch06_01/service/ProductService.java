package com.example.ch06_01.service;

import com.example.ch06_01.entities.Product;
import com.example.ch06_01.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-03        koiw1       최초 생성
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository ;

    public List<Product> findAll() {
        return productRepository.findAll() ;
    }

}
