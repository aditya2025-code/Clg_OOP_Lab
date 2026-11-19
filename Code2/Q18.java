package Code2;
// Q18. Bank Account Deposit and Withdrawal

class Account {

    int accountNumber;
    double balance;

    // No-argument Constructor
    Account() {
        accountNumber = 0;
        balance = 0.0;
    }

    // Parameterized Constructor
    Account(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    // Deposit Method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdrawal Method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display Account Details
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Q18 {
    public static void main(String[] args) {

        Account a1 = new Account(101, 5000);

        a1.display();
        a1.deposit(2000);
        a1.withdraw(1000);

        System.out.println("------------------");
        a1.display();
    }
}

//OUTPUT:
/*
Account Number: 101
Balance: 5000.0
Deposited: 2000.0
Withdrawn: 1000.0
------------------
Account Number: 101
Balance: 6000.0
*/