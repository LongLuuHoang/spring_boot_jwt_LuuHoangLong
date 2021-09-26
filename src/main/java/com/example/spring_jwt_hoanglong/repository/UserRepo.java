package com.example.spring_jwt_hoanglong.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_jwt_hoanglong.entity.User;
public interface UserRepo extends JpaRepository<User,Long>{
    User findByUsername(String username);
}
