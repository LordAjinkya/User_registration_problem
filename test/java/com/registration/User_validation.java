package com.registration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;

import javax.management.ConstructorParameters;



public class User_validation {


    @Test
    public void givenFirstName_whenProper_Returntrue(){
        Registration_user validator = new Registration_user();
        boolean firstname = false;
        try {
            firstname = validator.firstname("Ajinkya");
        } catch (Registration_user_Exception  e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(true,firstname);
    }

    @Test
    public void givenFirstName_whenincomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean firstname = false;
        try {
            firstname = validator.firstname("Ajin");
        } catch (Registration_user_Exception e) {
            e.printStackTrace();
        }

        Assertions.assertEquals(false,firstname);
    }

    @Test
    public void givenMobileNumber_whenProper_ShouldReturntrue(){
        Registration_user validator = new Registration_user();
        //MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean mobilenumber = false;
        try {
            mobilenumber = Registration_user_Exception.MobileNo("91 9172695674");
        } catch (Registration_user_Exception e) {
            e.printStackTrace();
        }
        //String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals(true,mobilenumber);
    }

    @Test
    public void givenMobileNumber_whenincomplete_ShouldReturntrufalse(){
        Registration_user validator = new Registration_user();
        //MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean number = false;
        try {
            mobilenumber = Registration_user_Exception.MobileNo("91 9172695");
        } catch (Registration_user_Exception e) {
            e.printStackTrace();
        }
        //String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals(false,number);
    }

    @Test
    public void givenFirstName_whencomplete_Returntrue(){
        Registration_user validator = new Registration_user();
        boolean lastname = false;
        try {
            lastname = validator.lastname("Ajinkya");
        } catch (Registration_user_Exception  e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(true,lastname);
    }

    @Test
    public void givenlastName_whenincomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean lastname = false;
        try {
            lastname = validator.lastname("Nara");
        } catch (Registration_user_Exception  e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(false,lastname);
    }

    @Test
    public void givenemail_whencomplete_Returntrue(){
        Registration_user validator = new Registration_user();
        boolean Email = false;
        try {
            Email = validator.Email("ajinkyanarale007@gmail.com");
        } catch (Registration_user_Exception  e) {
            e.printStackTrace();
        }

        Assertions.assertEquals(true,Email);
    }

    @Test
    public void givenemail_whenincomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean Email = false;
        try {
            Email = validator.Email("ajinkyanarale007@gmail");
        } catch (Registration_user_Exception  e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(false,Email);
    }

    @Test
    public void given_Password_whencomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean Password = false;
        try {
            Password = validator.Password("Diamond");
        } catch (Registration_user_Exception  e) {
            e.printStackTrace();
        }

        Assertions.assertEquals(true,Password);
    }

    @Test
    public void given_password_whenincomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean Password = false;
        try {
            Password = validator.Password("DIAMOND");
        } catch (Registration_user_Exception  e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(false,Password);
    }

}
