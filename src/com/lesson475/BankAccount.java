package com.lesson475;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount() {
        this("456465", 2.5, "Default name", "Default Address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance,
                    String customerName, String customerEmailAddress,
                    String customerPhoneNumber
    ) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance < withdrawalAmount) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
