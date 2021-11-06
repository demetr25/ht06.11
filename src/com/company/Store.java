package com.company;

public class Store {
    String name;
    String url;
    User[] users;
    User autUser;

    public Store(String name, String url, User[] users, User autUser) {
        this.name = name;
        this.url = url;
        this.users = users;
        this.autUser = autUser;
    }

    public boolean login(String login, String password) {
        if (login == null || password == null) {
            return false;
        } else {
            int a = 0;
            for (int i = 0; i < users.length; i++) {
                if(login.equals(users[i].login) && password.equals(users[i].password)){
                    a = 1;
                    autUser = users[i];
                }
            }
            if(a == 1){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void getCurrentUserRights(){
        if(autUser.role.equals(Status.ADMINISTRATOR)){
            System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
        }
        else if(autUser.role.equals(Status.HEADMASTER)){
            System.out.println("Директор магазина, может управлять кадрами, и ценами");
        }
        else if(autUser.role.equals(Status.MANAGER)){
            System.out.println("Менеджер магазина, может общаться с клиентами");
        }
        else if (autUser.role.equals(Status.CLIENT)){
            System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
        }
        else if(autUser.role.equals(Status.ANONYM)){
            System.out.println("Анонимный пользователь, может покупать товары и/или авторизоваться");
        }
    }

    public void logout(){
        autUser = null;
        System.out.println("Пользователь вышел из системы");
    }
}
