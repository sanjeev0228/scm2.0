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
public class Contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String description;
    private String picture;
    private boolean favorite = false;
    private String instagramLInk;
    private String FacebookLink;
    private String  websiteLink;
    private String linkedInLink;


    @ManyToOne
    private  User user;




    @OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<SocialLink> links = new ArrayList<>();




//    private List<String> socialLinks = new ArrayList<>();



}
