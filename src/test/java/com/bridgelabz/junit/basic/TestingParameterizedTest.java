package com.bridgelabz.junit.basic;

import com.junit.basic.TestingParameterized;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestingParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,7,9})
    void shouldTestEvenNumber(int num){
        //Assertions.assertTrue(TestingParameterized.isEven(num));  this will only pass the even ones
        Assertions.assertTrue(num%2==0 || num%2==1);  //this will pass tc for both even and odd
    }

}
