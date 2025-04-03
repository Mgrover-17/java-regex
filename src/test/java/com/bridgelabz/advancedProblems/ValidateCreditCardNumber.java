package com.bridgelabz.advancedProblems;

import java.util.regex.*;

public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        String cardNumber="4111 1111 1111 1111";
        String visaRegex="^4[0-9]{12}(?:[0-9]{3})?$";
        String masterCardRegex = "^(5[1-5][0-9]{14}|2(2[2-9][0-9]{2}|2[3-9][0-9]{3}|[3-6][0-9]{4}|7[0-1][0-9]{3}|720[0-9]{2})[0-9]{10})$";
        cardNumber = cardNumber.replaceAll("[ -]", "");
        Pattern visaPattern = Pattern.compile(visaRegex);
        Pattern masterCardPattern = Pattern.compile(masterCardRegex);
        Matcher visaMatcher = visaPattern.matcher(cardNumber);
        Matcher masterCardMatcher = masterCardPattern.matcher(cardNumber);
        System.out.println(visaMatcher.matches() || masterCardMatcher.matches());
    }
}
