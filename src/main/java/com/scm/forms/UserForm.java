package com.scm.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserForm {
    @NotBlank(message = "Username is required")
    @Size(min = 3,message = "MINIUMUM # CHaracters is required")
    private String name;
    @Email(message = "Invalid Email Address")
    private String email;
    @NotBlank(message = "Password is requird")
    @Size(min = 3)
    private String password;

    @Size(min = 250,message = "Max 250 CHaracter is required")
    private String about;
    @Size(min = 3,max = 12,message = "Invalid Phone no")
    private String phoneNumber;






}
