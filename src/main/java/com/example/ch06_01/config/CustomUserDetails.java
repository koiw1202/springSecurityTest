package com.example.ch06_01.config;

import com.example.ch06_01.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-03        koiw1       최초 생성
 */
public class CustomUserDetails implements UserDetails {

    private final User user ;

    public CustomUserDetails(User user) {
        this.user = user;
    }

    public final User getUser() {
        return user ;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getAuthority().stream()
                .map(a -> new SimpleGrantedAuthority(
                        a.getName()))
                .collect(Collectors.toList()) ;
    }

    @Override
    public String getPassword() {
        return user.getPassword() ;
    }

    @Override
    public String getUsername() {
        return user.getUsername() ;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true ;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true ;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true ;
    }
}
