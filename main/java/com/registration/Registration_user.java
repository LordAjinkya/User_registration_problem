package com.registration;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Registration_user {
    public static final Scanner scan = new Scanner(System.in);
    public static boolean firstname(String firstname) {
        System.out.println("Enter Your First name");


        System.out.println("The first name is: " + firstname);
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if (firstname.matches(pattern)) {
            System.out.println("Name is Valid");
            return true;
        } else {
            System.out.println("Name is Invalid");
            return false;
        }
    }

    //validating last name of the user
    public static boolean lastname(String lastname) {
        System.out.println("Enter Your last name");


        System.out.println("The last name is: " + lastname);
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if (lastname.matches(pattern)) {
            System.out.println("Name is Valid");
            return true;
        } else {
            System.out.println("Name is Invalid");
            return false;
        }
    }

    //validate user email
    public static boolean Email(String Email)
    {
        System.out.println("Enter Your Email");

        System.out.println("The Email is: " + Email);
        String pattern = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        if( Email.matches(pattern))
        {
            System.out.println("email is Valid");
            return true;
        }
        else
        {
            System.out.println("email is Invalid");
            return false;
        }
    }

    //validate mobile num
    public static boolean MobileNo(String mobilenumber )
    {
        System.out.println("The Mobile No is: " + mobilenumber);
        String pattern =  "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
        if( mobilenumber.matches(pattern))
        {
            System.out.println("number is Valid");
            return true;
        }
        else
        {
            System.out.println("number is Invalid");
            return false;
        }
    }
    public static boolean Password(String Password)
    {
        System.out.println("Enter Your Password.");

        System.out.println("The Password is: " + Password);
        String pattern =  "^[A-Za-z0-9]{8,}$";
        if( Password.matches(pattern))
        {
            System.out.println("Password is Valid");
            return true;
        }
        else
        {
            System.out.println("Password is Invalid");
            return false;
        }
    }
    public static void UpperCase()
    {
        System.out.println("Enter Your Password.");
        String UpperCase = scan.nextLine();

        System.out.println("The Password is: " + UpperCase);
        String pattern =  "^(.*[A-Z]{1}[A-Za-z0-9]{7,})$";
        if( UpperCase.matches(pattern))
        {
            System.out.println("password is Valid");
        }
        else
        {
            System.out.println("password is Invalid");
        }
    }

    public static void numinpassword()
    {
        System.out.println("Enter Your Password.");
        String numinpassword = scan.nextLine();

        System.out.println("The Password is: " + numinpassword);
        String pattern = "^(.*[A-Z]{1,}[0-9]{1,}[A-Za-z0-9]{6,})$";
        if( numinpassword.matches(pattern))
        {
            System.out.println("password is Valid");
        }
        else
        {
            System.out.println("password is Invalid");
        }
    }

    //password with one special character
    public static void SpecialCharacter()
    {
        System.out.println("Enter Your Password.");
        String SpecialCharacter = scan.nextLine();

        System.out.println("The Password is: " + SpecialCharacter);
        String pattern = "^(.*[A-Z]{1,}.*[0-9]{1,}.*[~!@#$%^&*]?[A-Za-z0-9]{5,})$";
        if( SpecialCharacter.matches(pattern))
        {
            System.out.println("password is Valid");
        }
        else
        {
            System.out.println("password is Invalid");
        }
    }

    //validate all emails


    public static void main(String[] args) {
        System.out.println("Welcome to user registration problem");
        firstname(scan.nextLine());
        lastname(scan.nextLine());
        Email(scan.nextLine());
        MobileNo(scan.nextLine());
        Password(scan.nextLine());
        UpperCase();
        numinpassword();
        SpecialCharacter();


        //UC9 Should clear all email samples
        String email1 ="abc@yahoo.com";
        String email2 ="abc-100@yahoo.com";
        String email3 = "abc.100@yahoo.com";
        String email4 = "abc111@abc.com";
        String email5 = "abc-100@abc.net";
        String email6 ="abc.100@abc.com.au";
        String email7 ="abc@1.com";
        String email8 = "abc@gmail.com";
        String email9 = "abc+100@gmail.com";
        String email10 = "abc";
        String email11 = "abc@.com.my";
        String email12 = "abc123@gmail.a";
        String email13 = "abc123@.com";
        String email14 = "abc123@.com.com";
        String email15 = ".abc@abc.com";
        String email16 = "abc()*@gmail.com";
        String email17 = "abc@%*.com";
        String email18 = "abc..2002@gmail.com";
        String email19 = "abc.@gmail.com";
        String email20 = "abc@abc@gmail.com";
        String email21 = "abc@gmail.com.1a";
        String email22 = "abc@gmail.com.aa.au";

        String MULTIPLE_EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9]+)*@"+"(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$";

        Pattern patterns1 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers1 = patterns1.matcher(email1);
        boolean results1 = matchers1.matches();
        System.out.println(results1);

        Pattern patterns2 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers2 = patterns2.matcher(email2);
        boolean results2 = matchers2.matches();
        System.out.println(results2);

        Pattern patterns3 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers3 = patterns3.matcher(email3);
        boolean results3 = matchers3.matches();
        System.out.println(results3);

        Pattern patterns4 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers4 = patterns4.matcher(email4);
        boolean results4 = matchers4.matches();
        System.out.println(results4);

        Pattern patterns5 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers5 = patterns5.matcher(email5);
        boolean results5 = matchers5.matches();
        System.out.println(results5);

        Pattern patterns6 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers6 = patterns6.matcher(email6);
        boolean results6 = matchers6.matches();
        System.out.println(results6);

        Pattern patterns7 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers7 = patterns7.matcher(email7);
        boolean results7 = matchers7.matches();
        System.out.println(results7);

        Pattern patterns8 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers8 = patterns8.matcher(email8);
        boolean results8 = matchers8.matches();
        System.out.println(results8);

        Pattern patterns9 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers9 = patterns9.matcher(email9);
        boolean results9 = matchers9.matches();
        System.out.println(results9);

        Pattern patterns10 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers10 = patterns10.matcher(email10);
        boolean results10 = matchers10.matches();
        System.out.println(results10);

        Pattern patterns11 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers11 = patterns11.matcher(email11);
        boolean results11 = matchers11.matches();
        System.out.println(results11);

        Pattern patterns12 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers12 = patterns12.matcher(email12);
        boolean results12 = matchers12.matches();
        System.out.println(results12);

        Pattern patterns13 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers13 = patterns13.matcher(email13);
        boolean results13 = matchers13.matches();
        System.out.println(results13);

        Pattern patterns14 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers14 = patterns14.matcher(email14);
        boolean results14 = matchers14.matches();
        System.out.println(results14);

        Pattern patterns15 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers15 = patterns15.matcher(email15);
        boolean results15 = matchers15.matches();
        System.out.println(results15);

        Pattern patterns16 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers16 = patterns16.matcher(email16);
        boolean results16 = matchers16.matches();
        System.out.println(results16);

        Pattern patterns17 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers17 = patterns17.matcher(email17);
        boolean results17 = matchers17.matches();
        System.out.println(results17);

        Pattern patterns18 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers18 = patterns18.matcher(email18);
        boolean results18 = matchers18.matches();
        System.out.println(results18);

        Pattern patterns19 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers19 = patterns19.matcher(email19);
        boolean results19 = matchers19.matches();
        System.out.println(results19);

        Pattern patterns20 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers20 = patterns20.matcher(email20);
        boolean results20 = matchers20.matches();
        System.out.println(results20);

        Pattern patterns21 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers21 = patterns21.matcher(email21);
        boolean results21 = matchers21.matches();
        System.out.println(results21);

        Pattern patterns22 = Pattern.compile(MULTIPLE_EMAIL_PATTERN);
        Matcher matchers22 = patterns22.matcher(email22);
        boolean results22 = matchers22.matches();
        System.out.println(results22);

    }
    



}
