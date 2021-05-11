package com.registration;
import java.util.*;

public class Registration_user {
    public static final Scanner scan = new Scanner(System.in);
    public static void firstname()
    {
        System.out.println("Enter Your First name");
        String name = scan.nextLine();

        System.out.println("The first name is: " + name);
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }

    //validating last name of the user
    public static void LastName()
    {
        System.out.println("Enter Your Last name");
        String name = scan.nextLine();

        System.out.println("The Last name is: " + name);
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }

    //validate user email
    public static void Email()
    {
        System.out.println("Enter Your Email");
        String email = scan.nextLine();

        System.out.println("The Email is: " + email);
        String pattern = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        if( email.matches(pattern))
        {
            System.out.println("email is Valid");
        }
        else
        {
            System.out.println("email is Invalid");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to user registration problem");
        firstname();
        LastName();
        Email();

    }
}
