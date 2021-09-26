package com.example.spring_jwt_hoanglong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class SpringJwtHoangLongApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtHoangLongApplication.class, args);
    }

}
