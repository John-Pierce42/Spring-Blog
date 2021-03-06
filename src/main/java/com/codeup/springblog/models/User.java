package com.codeup.springblog.models;

import javax.persistence.*;

@Entity(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;


    public User(){};

//    insert constructor
    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;

    }
//    update constructor
    public User(long id,String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
}



    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }


    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}