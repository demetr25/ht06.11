package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User hdm = new User("dir", "qwerty12", "Anton", Status.HEADMASTER);
        User adm = new User("admin", "A2yui", "Igor", Status.ADMINISTRATOR);
        User mng = new User("manag", "ytrewq1", "Ekaterina", Status.MANAGER);
        User clt = new User("demetr25", "12344321", "Dmytro", Status.CLIENT);
        User anon = new User("1", "1", "1", Status.ANONYM);

        User[] users = {hdm, adm, mng, clt, anon};

        Store st = new Store("ATB", "https://www.atbmarket.com/uk", users, clt);

        while(true){
            tryLogin(st);
        }
    }

    public static void tryLogin(Store st1){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин -> ");
        String login = sc.nextLine();
        System.out.print("Введите пароль -> ");
        String password = sc.nextLine();

        st1.login(login, password);

        if(st1.login(login, password)) {
            st1.getCurrentUserRights();
            st1.logout();
        }
        else{
            System.out.println("Неверный логин и/или пароль");
        }
    }
}
