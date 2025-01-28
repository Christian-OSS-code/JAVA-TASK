package test.Account;

import ZeroBalanceException.ZeroBalanceException;
import org.junit.Test;
import src.Account.Account;
import src.Account.exceptions.InsufficientBalanceException;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AccountTest {
    @Test
    public void testAccount_Exists() {
        Account myAccount = new Account("John", "Ibu", 5000.0, "0057950185", "Savings", 1023);
    }
    @Test
    public void test_If_Account_Can_Deposit() {
        Account myAccount = new Account("John", "Ibu", 5000.0, "0057950185", "Savings", 1023);
        myAccount.deposit(500.0);
        assertEquals(5500.0, myAccount.getBalance(1023), 0.001);
    }
    @Test
    public void test_If_Account_Can_Withdraw() {
        Account myAccount = new Account("John", "Ibu", 5000.0, "0057950185", "Savings", 1023);
        myAccount.deposit(500.0);
        myAccount.withdraw(2500.0);
        assertEquals(3000, myAccount.getBalance(1023), 0.001);
    }
    @Test
    public void test_If_Account_Can_Throws_An_Exception_WhenBalance_Is_Insufficient() {
        Account myAccount = new Account("John", "Ibu", 5000.0, "0057950185", "Savings", 1023);
        myAccount.deposit(500.0);
        assertThrows(InsufficientBalanceException.class,() -> myAccount.withdraw(250000.0));

    }
    @Test
    public void test_If_Account_DoesNot_Run_Zero_Balance() {
        Account myAccount = new Account("John", "Ibu", 5000.0, "0057950185", "Savings", 1023);

        myAccount.deposit(500.0);
        assertThrows(ZeroBalanceException.class,() -> myAccount.withdraw(5500.0));
    }

}

