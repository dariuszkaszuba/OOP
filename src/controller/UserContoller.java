package controller;

import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserContoller {
    User users[] = new User[100];
    int index;

    public void addUser(String name, String lastname, String login, String password, String email, String phone, LocalDate birth_datel, LocalDateTime registration_date_time) {
        User u = new User(name, lastname, login, password, email, phone, birth_datel, registration_date_time);
        u.setRegistration_date_time(u.getRegistration_date_time().plusHours(1));
        users[index] = u;
        index++;
    }

    public boolean birthDateComparator(User u1, User u2) {
        return u1.getBirth_datel().isBefore(u2.getBirth_datel());
    }

    public boolean birthDateComparator(int index1, int index2) {
        return users[index1].getBirth_datel().isBefore(users[index2].getBirth_datel());
    }

    public void getAllUsers() {
        for (int i = 0; i < index; i++) {
            System.out.println(users[i]);
        }
    }

    public void sortByBirthdate() {
//        boolean condition=true;
//        if(type.equals("ACS")){
//            condition=false;
//        }
        for (int j = 0; j < index; j++) {
            for (int i = 1; i < index; i++) {
                if (!birthDateComparator(i - 1, i)) {
                    User u1 = users[i - 1];
                    User u2 = users[i];
                    users[i - 1] = u2;
                    users[i] = u1;
                }
            }
        }
    }

}
