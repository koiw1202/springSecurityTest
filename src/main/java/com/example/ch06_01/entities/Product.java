package com.example.ch06_01.entities;

import com.example.ch06_01.entities.enums.Currency;
import lombok.Getter;

import javax.persistence.*;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-03        koiw1       최초 생성
 */
@Entity
@Getter
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(length = 45, nullable = false)
    private String name ;

    @Column(length = 45, nullable = false)
    private double price ;

    @Enumerated(EnumType.STRING)
    private Currency currency ;

}
