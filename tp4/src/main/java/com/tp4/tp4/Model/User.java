package com.tp4.tp4.Model;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter @Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    int id;
    String so;
    String browser;
    public User(String so,String browser){
        this.browser=browser;
        this.so=so;
    }
    public String toString(){
        return this.so+" "+this.browser;
    }
}
