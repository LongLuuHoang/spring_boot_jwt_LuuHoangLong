package com.example.spring_jwt_hoanglong.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "t_token")
public class Token extends Base {
    @Column(length = 1000)
    private String token;
    private Date tokenExpDate;
}
