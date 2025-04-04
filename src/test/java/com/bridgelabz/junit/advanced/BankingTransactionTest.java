package com.bridgelabz.junit.advanced;

import com.junit.advanced.BankingTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankingTransactionTest {
    BankingTransaction transaction;

    @BeforeEach
    void setUp(){
        transaction=new BankingTransaction();
    }

    @Test
    void shouldDeposit() throws Exception {
        transaction.deposit(100.0);
        Assertions.assertEquals(100.0,transaction.getBalance(),"Balance should be 100 after depositing 100");
    }

    @Test
    void shouldWithdraw() throws Exception {
        transaction.deposit(200.0);
        transaction.withdraw(50.0);
        Assertions.assertEquals(150.0,transaction.getBalance(),"Balance should be 150 after withdrawing 50");
    }
}
