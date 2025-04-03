package com.bridgelabz.junit.basic;

import com.junit.basic.ExceptionHandling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
    ExceptionHandling calculator=new ExceptionHandling();

    @Test
    public void shouldDivide(){
        Assertions.assertEquals(2,calculator.divide(4,2));
    }
    @Test
    public void shouldDivideByZeroTest(){
        Assertions.assertThrows(ArithmeticException.class,()->{
            calculator.divide(2,0);
        }, "Expected Arithmetic Exception when dividing by zero.");
    }
}
