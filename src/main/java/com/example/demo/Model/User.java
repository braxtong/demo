package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.groups.Default;

@Data
@AllArgsConstructor
public class User {
    public interface Add extends Default {

    }
    public interface Update extends Default {

    }
    @Email(message = "Email is not right!")
    public String name;
    @Null( groups = {Update.class})
    @NotBlank( groups = {Add.class},message =  "Password cant be blank")
    public String password;
}
