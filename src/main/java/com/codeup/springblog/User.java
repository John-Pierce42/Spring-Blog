package com.codeup.springblog;

import javax.persistence.*;

@Entity(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String userName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;


    public User(){};

//    insert constructor
    public User(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;

    }
//    update constructor
    public User(long id,String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
}

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}