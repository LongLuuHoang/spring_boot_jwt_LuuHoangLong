package com.example.spring_jwt_hoanglong.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_jwt_hoanglong.entity.Token;
public interface TokenRepo extends JpaRepository<Token,Long> {
}
