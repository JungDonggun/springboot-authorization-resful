package com.co.kr.authorization.authorization.domain.authorization.user;


import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "authorization")
public class User {
    @Id
    private String identity;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 12)
    private String nickname;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private Integer age;


    @Builder
    User(String identity, String password, String nickname, String address, Integer age) {
        this.identity = identity;
        this.password = password;
        this.nickname = nickname;
        this.address = address;
        this.age = age;
    }
}
