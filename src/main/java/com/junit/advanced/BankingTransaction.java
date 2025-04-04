package com.junit.advanced;

public class BankingTransaction {
    double balance=0;
    public double deposit(double amount) throws Exception {
        if(amount<=0){
            throw new Exception("Deposit amount must be positive");
        }
        balance+=amount;
        return balance;
    }
    public double withdraw(double amount) throws Exception {
        if(amount<=0){
            throw new Exception("Withdrawal amount must be positive");
        }
        if(amount>balance){
            throw new Exception("Insufficient");
        }
        balance-=amount;
        return balance;
    }
    public double getBalance(){
        return balance;
    }
}
