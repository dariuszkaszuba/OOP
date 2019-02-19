package controller;

import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserContoller {
    User users[] = new User[100];
    int index;

    public void addUser(String name, String lastname, String login, String password, String email, String phone, LocalDate birth_datel, LocalDateTime registration_date_time){
        User u=new User(name, lastname, login, password, email, phone,birth_datel, registration_date_time);
    }
}
