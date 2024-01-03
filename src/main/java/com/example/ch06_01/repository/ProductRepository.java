package com.example.ch06_01.repository;

import com.example.ch06_01.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-03        koiw1       최초 생성
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
