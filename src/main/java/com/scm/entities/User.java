package com.scm.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private  String userId;
    @Column(name = "user_name",nullable = false)
    private  String name;
    @Column(unique = true,nullable = false)
    private String email;
    private String password;

    private  String about;

    private  String profilePic;


    private  boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified=false;


    @Enumerated(value = EnumType.STRING)
    private  Providers  provider = Providers.SELF;
    private  String providerId;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List <Contact> contacts = new ArrayList<>();



}
