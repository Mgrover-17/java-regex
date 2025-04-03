package com.bridgelabz.junit.basic;

import com.junit.basic.StringUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {
    StringUtility stringUtilityMethods=new StringUtility();

    @Test
    public void shouldReverse(){
        Assertions.assertEquals("olleh",stringUtilityMethods.reverse("hello"));
    }

    @Test
    public void shouldPalindrome(){
        Assertions.assertTrue(stringUtilityMethods.isPalindrome("madam"));
    }

    @Test
    public void shouldUpperCase(){
        Assertions.assertEquals("JAVA",stringUtilityMethods.toUpperCase("java"));
    }
}
