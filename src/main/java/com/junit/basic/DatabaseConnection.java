package com.junit.basic;

public class DatabaseConnection {
    public boolean isConnected=false;

    public void connect(){
        isConnected=true;
        System.out.println("Database connected");
    }

    public void disconnect(){
        isConnected=false;
        System.out.println("Database disconnected");
    }
}
