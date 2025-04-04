package com.junit.basic;

public class TestingParameterized {
    public static boolean isEven(int number){
        boolean even=false;
        if(number%2==0){
            System.out.println("even");
            return true;
        }
        return false;
    }
}
