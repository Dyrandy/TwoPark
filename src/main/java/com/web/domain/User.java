package com.web.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@Entity
@Table
public class User{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;
    private String nickname;
    private String id;
    private String newID;
    private String password;
    private String email;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

//    public String getUsername(){
//        return username;
//    }

    public void setID(String id){
        this.id = id;
    }

    public void setPW(String pw){
        this.password = pw;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void updateID(String newID){ this.newID = newID; }

    public String getNickname() { return nickname; }

    public String getID() { return id; }

    public String getEmail() { return email; }

    public String getPW() { return password; }

//    public String getPassword(){
//        return password;
//    }


}
