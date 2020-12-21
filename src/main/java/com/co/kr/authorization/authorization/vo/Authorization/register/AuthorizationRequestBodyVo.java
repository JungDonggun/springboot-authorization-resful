package com.co.kr.authorization.authorization.vo.Authorization.register;

public class AuthorizationRequestBodyVo {
    private final String identity;
    private final String password;
    private final String address;
    private final String nickName;
    private final String registerAt;
    private final Integer age;

    public AuthorizationRequestBodyVo(String identity, String password, String address, String nickName, String registerAt, Integer age) {
        this.identity = identity;
        this.password = password;
        this.address = address;
        this.nickName = nickName;
        this.registerAt = registerAt;
        this.age = age;
    }

    public String getIdentity() {
        return identity;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getNickName() {
        return nickName;
    }

    public Integer getAge() {
        return age;
    }

    public String getRegisterAt() {
        return registerAt;
    }
}
