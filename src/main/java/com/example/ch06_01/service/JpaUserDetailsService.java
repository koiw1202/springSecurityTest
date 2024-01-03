package com.example.ch06_01.service;

import com.example.ch06_01.config.CustomUserDetails;
import com.example.ch06_01.entities.User;
import com.example.ch06_01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-03        koiw1       최초 생성
 */
@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository ;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Supplier<UsernameNotFoundException> s =
                () -> new UsernameNotFoundException("Problem during authentication!") ;

        User u = userRepository
                .findUserByUsername(username)
                .orElseThrow(s) ;

        return new CustomUserDetails(u) ;
    }
}
