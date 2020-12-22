package com.example.vize;

import java.util.Date;

public class Register {


    private String Username;
    private String Password;
    private Integer user_id;
    private String home_directory;
    private Date registered_time;
    private Integer remaining_time;



    // Constructor

    public Register(String Username, String Password, Integer user_id, String home_directory,
                    Date registered_time, Integer remaining_time) {

        this.Username = Username;
        this.Password = Password;
        this.user_id = user_id;
        this.home_directory = home_directory;
        this.registered_time = registered_time;
        this.remaining_time = remaining_time;
        this.remaining_time = remaining_time;

    }


    // Encapsulation

    public String getUsername() {
        return Username;
    }

    public void setUsername(String newUsername) {
        this.Username = newUsername;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String newPassword) {
        this.Password = newPassword;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer newID) {
        this.user_id = newID;
    }

    public String getHomeDirectory() {
        return home_directory;
    }

    public void setHomeDirectory(String newDirectory) {
        this.home_directory = newDirectory;
    }

    public Date getRegisteredTime() {
        return registered_time;
    }

    public void setRegisteredTime(Date newRegTime) {
        this.registered_time = newRegTime;
    }

    public Integer getRemainingTime() {
        return remaining_time;
    }

    public void setUsername(Integer newRemTime) {
        this.remaining_time = newRemTime;
    }

}
