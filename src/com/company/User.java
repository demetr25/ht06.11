package com.company;

public class User {
    String login;
    String password;
    String name;
    Status role = Status.ANONYM;

    public User(String login, String password, String name, Status role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }
}
