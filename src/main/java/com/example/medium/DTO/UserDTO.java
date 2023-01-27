package com.example.medium.DTO;

import javax.validation.constraints.*;

public class UserDTO {

    @Size(min = 5 , message = "your first name should have more than 5 characters ")
    private String firstName ;

    @NotBlank(message = "last  name is blank ")
    private String lastName ;

    @Email(message = "enter a valid email ")
    @NotNull(message = "your email must not be null ")
    private String email ;

    @Min(value = 18 , message = "your age should be greater than 18 ")
    @Max(value = 60 , message = "your age should be less  than  18 ")
    private int age ;




    public UserDTO(){
        System.out.println("UserDTO constructor called");
    }

    public String getFirstName() {
       // System.out.println("firstName getter  called ");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("firstName setter  called ");
        this.firstName = firstName;
    }


    public String getLastName() {
        //System.out.println(" lastName getter called ");
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("lastName  setter  called ");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
