package src.Account;

import ZeroBalanceException.ZeroBalanceException;
import src.Account.exceptions.InsufficientBalanceException;

public class Account {

    private String firstName;
    private String lastName;
    private double balance;
    private String accountNumber;
    private String accountType;
    private int accountPin;

    public Account(String firstName, String lastName, double balance, String accountNumber, String accountType, int accountPin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountPin = accountPin;

    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }
    public double getBalance(int pin) {

        if (pin == accountPin) {
            return balance;
        }
        else throw new RuntimeException("Invalid pin");
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
        }
        else if (amount == balance) {
            throw new ZeroBalanceException("Account is not a 0.0 account");

        }
        else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
    }
}

