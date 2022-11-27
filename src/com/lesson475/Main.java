package com.lesson475;

public class Main {
    public static void main(String[] args) {
        BankAccount quanAccount = new BankAccount("12345", 0.00, "Quan Luu", "quanlm@gmail.com", "0909123");
        quanAccount.withdrawal(100.0);
        quanAccount.deposit(50.0);
    }    
}
