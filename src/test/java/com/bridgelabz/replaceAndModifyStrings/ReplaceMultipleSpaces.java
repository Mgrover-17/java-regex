package com.bridgelabz.replaceAndModifyStrings;

import java.util.regex.*;

public class ReplaceMultipleSpaces {
    public static String replace(String text){
        return text.replaceAll("\\s"," ").trim();
    }
    public static void main(String[] args) {
        String text="This   is  an   example    with   multiple   spaces.";
        String result=replace(text);
        System.out.println(result);
    }
}
