package Code;
// Q6. Bank Account – Method
/*
Jiya has opened a bank account. She wants a program that can deposit money into her account and display her updated balance.
Question: Write a Java program using a class BankAccount and a method deposit() to add money to the account and display the balance.
*/
// Banking System Program
class BankAccount{
    String name;
    int balance = 0;
    BankAccount(String n){
        name = n;
    }
    void deposit(int money){
        balance += money;
        System.out.println(name+", Rs."+money+" has been credited to your account");
        System.out.println("Your updated balance: "+balance);
    }
}

class Q06 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Jiya");
        a1.deposit(5000);
    }
}

// OUTPUT:
/*
Jiya, Rs.5000 has been credited to your account
Your updated balance: 5000
*/