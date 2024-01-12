package com.example.ch17_01;

import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-12        koiw1       최초 생성
 */
@Service
public class ProductService {

    @PostFilter("filterObject.owner == authentication.name")
    public List<Product> sellProduct(List<Product> products) {

        products.add(new Product("beer", "nikolai")) ;
        products.add(new Product("candy", "nikolai")) ;
        products.add(new Product("chocolate", "julien")) ;

        return products ;
    }
}
