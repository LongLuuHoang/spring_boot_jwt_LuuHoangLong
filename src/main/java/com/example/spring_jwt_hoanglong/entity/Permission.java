package com.example.spring_jwt_hoanglong.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Table(name = "t_permission")
public class Permission extends Base {
    private String permissionName;
    private  String permissionKey;
}
