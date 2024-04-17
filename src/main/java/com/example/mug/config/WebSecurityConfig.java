package com.example.mug.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests() // 여기서 체이닝을 시작합니다.
                .requestMatchers("/", "/home").permitAll() // 특정 경로에 대한 접근 허용
                .anyRequest().authenticated() // 나머지 요청은 인증을 요구
                .and() // 다음 구성으로 넘어갑니다.
                .formLogin()
                .loginPage("/login") // 로그인 페이지 경로 설정
                .permitAll() // 로그인 페이지는 모두에게 접근 허용
                .and() // 다음 구성으로 넘어갑니다.
                .logout()
                .permitAll(); // 로그아웃도 모두에게 허용

        return http.build();
    }



    // 기타 필요한 빈 설정 추가 (예: PasswordEncoder, UserDetailsService 등)
}
