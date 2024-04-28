package springBlogExmaple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/home/**").hasAnyRole("ADMIN")
                        .requestMatchers("/hello/**").hasRole("MANAGER")
                        .anyRequest().permitAll()
                )
                .formLogin(Customizer.withDefaults()
        ) ;

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        var manager = new InMemoryUserDetailsManager() ;

        var user1 = User.builder()
                .username("john")
                .password("12345")
                .passwordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder()::encode)
                .roles("ADMIN")
                .build() ;

        var user2 = User.withUsername("jane")
                .password("12345")
                .passwordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder()::encode)
                .roles("MANAGER")
                .build() ;

        manager.createUser(user1);
        manager.createUser(user2);

        return manager ;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        Map<String, PasswordEncoder> encoders = new HashMap<>() ;

        encoders.put("noop", NoOpPasswordEncoder.getInstance()) ;
        encoders.put("bcrypt", new BCryptPasswordEncoder()) ;
        encoders.put("scrypt", SCryptPasswordEncoder.defaultsForSpringSecurity_v5_8()) ;

        return new DelegatingPasswordEncoder("noop", encoders) ;
    }
}
