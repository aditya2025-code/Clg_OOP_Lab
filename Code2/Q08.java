package Code2;
// Q8. Bank Account Constructor Overloading

class BankAccount {
    int accountNo;
    String holderName;
    double balance;

    // Default Constructor
    BankAccount() {
        accountNo = 0;
        holderName = "Unknown";
        balance = 0.0;
    }

    // Parameterized Constructor
    BankAccount(int no, String name, double bal) {
        accountNo = no;
        holderName = name;
        balance = bal;
    }

    // Display Account Details
    void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("------------------");
    }
}

public class Q08 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(101, "Aditya", 5000);
        b1.display();
        b2.display();
    }
}

// OUTPUT:
/*
 * Account No: 0
 * Holder Name: Unknown
 * Balance: 0.0
 * ------------------
 * Account No: 101
 * Holder Name: Aditya
 * Balance: 5000.0
 * ------------------
 */