package com.co.kr.authorization.authorization.vo.Authorization.register;

public class AuthorizationRequestBodyVo {
    private final String identity;
    private final String password;
    private final String address;
    private final String nickName;

    public AuthorizationRequestBodyVo(String identity, String password, String address, String nickName) {
        this.identity = identity;
        this.password = password;
        this.address = address;
        this.nickName = nickName;
    }

    public String getIdentity() {
        return identity;
    }

    public String password() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getNickName() {
        return nickName;
    }
}
