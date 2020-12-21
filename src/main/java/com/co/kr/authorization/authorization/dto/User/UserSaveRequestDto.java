package com.co.kr.authorization.authorization.dto.User;

import com.co.kr.authorization.authorization.domain.authorization.user.User;
import lombok.Builder;

import java.text.SimpleDateFormat;

public class UserSaveRequestDto {
    private String identity;
    private String password;
    private String address;
    private String nickName;
    private String registerAt;
    private Integer age;

    @Builder
    UserSaveRequestDto(String identity, String password, String address, String nickName, Integer age) {
        this.identity = identity;
        this.password = password;
        this.address = address;
        this.nickName = nickName;
        this.age = age;
        this.registerAt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").toString();
    }

    public User toEntity() {
        return User.builder()
                .identity(identity)
                .password(password)
                .address(address)
                .nickname(nickName)
                .age(age)
                .registerAt(registerAt)
                .build();
    }
}
