package com.example.ch06_01.entities;

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
public class Authority {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(length = 45, nullable = false)
    private String name ;

    @JoinColumn(name = "user")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user ;

}
