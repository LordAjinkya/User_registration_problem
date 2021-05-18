package com.registration;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)



public class Parametrized_test {
    public String email;
    public boolean expectedResult;
    public Registration_user registration_user;
    public Parametrized_test(String email, boolean expectedResult) {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize() {
        registration_user = new Registration_user();
    }

    @ParameterizedTest
    public static Collection input() {
        return Arrays.asList(new Object[][] {
                { "xyz@yahoo.com", true },
                { "xyz-100@yahoo.com" , true },
                { "xyz.100@yahoo.com" , true },
                { "xyz111@abc.net" , true },
                { "xyz-100@abc.net" , true },
                { "xyz.100@abc.com.au" , true },
                { "xyz@1.com" , true },
                { "xyz@gmail.com.com" , true },
                { "xyz+100@gmail.com" , true }});
    }
    @Test
    public void checkEmailValidOrNot() throws Registration_user_Exception {
        System.out.println("This is Expected Result"+ this.expectedResult);
        Assertions.assertEquals(this.expectedResult, registration_user.Email(this.email));
    }



}
