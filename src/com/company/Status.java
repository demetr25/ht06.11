package com.company;

public enum Status {
    ADMINISTRATOR("Администратор"),
    HEADMASTER("Директор"),
    CLIENT("Клиент"),
    ANONYM("Аноним"),
    MANAGER("Менеджер");

    private String inf;

    Status(String inf) {
        this.inf=inf;
    }

    public String getInf() {
        return inf;
    }
}
