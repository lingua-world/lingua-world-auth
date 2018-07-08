package com.linguaworld.auth.entity;


import org.springframework.data.redis.core.RedisHash;

import java.math.BigInteger;

@RedisHash("User")
public class User {

    private BigInteger id;

    private String login;

    private String password;

    public User() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
