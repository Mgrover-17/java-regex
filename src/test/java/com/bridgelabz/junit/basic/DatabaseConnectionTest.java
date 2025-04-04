package com.bridgelabz.junit.basic;

import com.junit.basic.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    void setUp(){
        //object create kro and establish a connection
        db=new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown(){
        //close the connection
        db.disconnect();
    }

    @Test
    void testConnectionEstablished(){
        Assertions.assertTrue(db.isConnected,"Connection should be established.");
    }

    @Test
    void testConnectionClosed() {
        db.disconnect();
        Assertions.assertFalse(db.isConnected, "Connection should be closed.");
    }
}
