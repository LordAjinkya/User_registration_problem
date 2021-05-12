package com.registration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class User_validation {
    @Test
    public void givenFirstName_whenProper_Returntrue(){
        Registration_user validator = new Registration_user();
        boolean firstname = validator.firstname("Ajinkya");
        Assertions.assertEquals(true,firstname);
    }

    @Test
    public void givenFirstName_whenincomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean firstname = validator.firstname("Ajiya");
        Assertions.assertEquals(false,firstname);
    }

    @Test
    public void givenMobileNumber_whenProper_ShouldReturntrue(){
        Registration_user validator = new Registration_user();
        //MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean number = validator.MobileNo("91 9172695674 ");
        //String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals(true,number);
    }

    @Test
    public void givenMobileNumber_whenincomplete_ShouldReturntrufalse(){
        Registration_user validator = new Registration_user();
        //MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean number = validator.MobileNo("9172695674 ");
        //String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals(false,number);
    }

    @Test
    public void givenFirstName_whencomplete_Returntrue(){
        Registration_user validator = new Registration_user();
        boolean lastname = validator.lastname("Narale");
        Assertions.assertEquals(true,lastname);
    }

    @Test
    public void givenlastName_whenincomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean lastname = validator.lastname("Nara");
        Assertions.assertEquals(false,lastname);
    }

    @Test
    public void givenemail_whencomplete_Returntrue(){
        Registration_user validator = new Registration_user();
        boolean Email = validator.Email("abc.xyz@lb.co.in");
        Assertions.assertEquals(true,Email);
    }

    @Test
    public void givenemail_whenincomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean Email = validator.Email("abc.xyz.co.in");
        Assertions.assertEquals(false,Email);
    }

    @Test
    public void given_Password_whencomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean Password = validator.Password("abc.xyz.co.in");
        Assertions.assertEquals(true,Password);
    }

    @Test
    public void given_password_whenincomplete_Returnfalse(){
        Registration_user validator = new Registration_user();
        boolean Password = validator.Password("abc.xyz.co.in");
        Assertions.assertEquals(false,Password);
    }

}
