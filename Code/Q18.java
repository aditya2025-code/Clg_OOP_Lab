package Code;
// Q18. ATM Banking Simulation System:

import java.util.*;

class BankSystem {

    String accountName;
    double balance;

    BankSystem(String name) {
        accountName = name;
        balance = 5000;
    }

    int checkBalance() {
        System.out.println("Your current balance is " + balance);
        return 1;
    }

    int deposit(double money) {
        balance += money;
        System.out.println("RS." + money + " Succesfully deposit to your account.");
        checkBalance();
        return 1;
    }

    int withdraw(double money) {
        if (balance > money) {
            balance -= money;
            System.out.println("RS." + money + " Succesfully withdraw to your account.");
            checkBalance();
        } else {
            System.out.println("Insufficient balance in your account");
        }
        return 1;
    }

    int accDetails() {
        System.out.println("Account Holder Name: " + accountName);
        System.out.println("Total balance: " + balance);
        return 1;
    }
}

class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account holder name: ");
        String name = sc.nextLine();
        BankSystem customer1 = new BankSystem(name);
        boolean menuOpen = true;
        while (menuOpen) {
            System.out.println(
                    "1.Check Account Balance\n2.Deposit Money into the Account\n3.Withdraw Money from the Account\n4.Display Account Holder Details\n0.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    sc.close();
                    return;
                case 1:
                    customer1.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double money = sc.nextDouble();
                    customer1.deposit(money);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    money = sc.nextDouble();
                    customer1.withdraw(money);
                    break;
                case 4:
                    customer1.accDetails();
                    break;
                default:
                    System.out.println("Select between 0-4 option...");
                    menuOpen = true;
            }
        }
        sc.close();
    }
}

//OUTPUT:
/*
Enter Account holder name: Aditya Das
1.Check Account Balance
2.Deposit Money into the Account
3.Withdraw Money from the Account
4.Display Account Holder Details
0.Exit
1
Your current balance is 5000.0
1.Check Account Balance
2.Deposit Money into the Account
3.Withdraw Money from the Account
4.Display Account Holder Details
0.Exit
2
Enter amount to deposit: 25000
RS.25000.0 Succesfully deposit to your account.
Your current balance is 30000.0
1.Check Account Balance
2.Deposit Money into the Account
3.Withdraw Money from the Account
4.Display Account Holder Details
0.Exit
3
Enter amount to withdraw: 50000
Insufficient balance in your account
1.Check Account Balance
2.Deposit Money into the Account
3.Withdraw Money from the Account
4.Display Account Holder Details
0.Exit
4
Account Holder Name: Aditya Das
Total balance: 30000.0
1.Check Account Balance
2.Deposit Money into the Account
3.Withdraw Money from the Account
4.Display Account Holder Details
0.Exit
3
Enter amount to withdraw: 200
RS.200.0 Succesfully withdraw to your account.
Your current balance is 29800.0
1.Check Account Balance
2.Deposit Money into the Account
3.Withdraw Money from the Account
4.Display Account Holder Details
0.Exit
0
*/