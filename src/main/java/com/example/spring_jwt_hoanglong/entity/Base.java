package com.example.spring_jwt_hoanglong.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Base implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deleted;
    @CreatedDate
    private Date createedAt;
    @LastModifiedDate
    private  Date updatedAt;

    private Long createBy;

    private  Long updateBy;

}