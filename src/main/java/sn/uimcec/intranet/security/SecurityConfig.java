package sn.uimcec.intranet.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import sn.uimcec.intranet.security.service.UserDetailServiceImpl;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig {
    private PasswordEncoder passwordEncoder;
    private UserDetailServiceImpl userDetailServiceImpl;
    @Bean
    public SecurityFilterChain securityWebFilterChain(HttpSecurity httpSecurity) throws Exception {


       // httpSecurity
           //     .authorizeHttpRequests().requestMatchers("/", "/accueil").permitAll();


        // 2 l'accée est permise à tt le monde
       // httpSecurity.formLogin().loginPage("/index").permitAll();

        httpSecurity.formLogin().loginPage("/login").permitAll();


       // 3 ressource autorisée
        httpSecurity.authorizeHttpRequests().requestMatchers("/css/***").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/fonts/***").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/img/***").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/assets/***").permitAll();


        //4 autorisation accées des pages
        httpSecurity.authorizeHttpRequests().requestMatchers("/user/**").hasRole("USER");
        httpSecurity.authorizeHttpRequests().requestMatchers("/admin/**").hasRole("ADMIN");
        httpSecurity.authorizeHttpRequests().requestMatchers("/dc/**").hasRole("DC");

        //httpSecurity.authorizeHttpRequests().requestMatchers("/../img/bg-1.jpg").permitAll();

        // 1 -l'accée à l'application n'est pas autorisé
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();


        // 4 accée application
        httpSecurity.userDetailsService(userDetailServiceImpl);

        return httpSecurity.build();
    }
}
