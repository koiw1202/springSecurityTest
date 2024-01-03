package com.example.ch06_01.entities;


import com.example.ch06_01.entities.enums.EncryptionAlgorithm;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-03        koiw1       최초 생성
 */
@Entity
@Getter
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(length = 45, nullable = false)
    private String username ;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String password ;

    @Enumerated(EnumType.STRING)
    private EncryptionAlgorithm algorithm ;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Authority> authority ;

}

