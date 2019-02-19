package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private String name, lastname, login, password, email, phone;
    private LocalDate birth_datel;
    private LocalDateTime registration_date_time;

    public User(String name, String lastname, String login, String password, String email, String phone, LocalDate birth_datel, LocalDateTime registration_date_time) {
        this.name = name;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.birth_datel = birth_datel;
        this.registration_date_time = registration_date_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birth_datel=" + birth_datel +
                ", registration_date_time=" + registration_date_time +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirth_datel() {
        return birth_datel;
    }

    public void setBirth_datel(LocalDate birth_datel) {
        this.birth_datel = birth_datel;
    }

    public LocalDateTime getRegistration_date_time() {
        return registration_date_time;
    }

    public void setRegistration_date_time(LocalDateTime registration_date_time) {
        this.registration_date_time = registration_date_time;
    }
}
