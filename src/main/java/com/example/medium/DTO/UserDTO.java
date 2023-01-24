package com.example.medium.DTO;

public class UserDTO {

    private String firstName ;

    private String lastName ;


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
}
