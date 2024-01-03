package com.example.ch06_01.repository;

import com.example.ch06_01.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-03        koiw1       최초 생성
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByUsername(String u) ;

}
