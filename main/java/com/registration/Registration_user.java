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
    public static void main(String[] args) {
        System.out.println("Welcome to user registration problem");
        firstname();

    }
}
