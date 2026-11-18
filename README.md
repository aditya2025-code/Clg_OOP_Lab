# Java(OOP)

Hi everyone! This repository contains all the programs shared by our professor in the official group. However, you don't need to write all of them in your lab copy. You can start writing from **Question 6 (Q6) onwards**.

I hope this helps. Thank you, and feel free to ask if you have any doubts!

>**IMPORTANT**: Lab Copy Questions start from Q6

## 1. Input-Output

### Input-Output Program - Code

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");
        // String input
        String name = myObj.nextLine();
        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        myObj.close();
    }

}
```

### Input-Output Program - OUTPUT

```text
Enter name, age and salary:
Aditya
20
1
Name: Aditya
Age: 20
Salary: 1.0
```

## 2. Palindrome Checker

### Palindrome Checker - Code

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int originalNumber = scanner.nextInt();
        // Keep a copy of the original number since we will modify 'num'
        int num = originalNumber;
        int reversedNumber = 0;
        // Reverse the number mathematically
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            num = num / 10;
        }
        // Compare the reversed number with the original number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        scanner.close();
    }
}
```

### Palindrome Checker - OUTPUT

```text
Enter an integer: 1221
1221 is a palindrome.
```

## 3. 3 type of Constructor

### Constructors program - Code

```java
// Default Constructor:
class DefaultStudentConstructor{
    String name;
    int age;
    DefaultStudentConstructor(){
        name = "Aditya";
        age = 20;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

// Copy Constructor:
class CopyStudentConstructor{
    String name;
    int age;
    CopyStudentConstructor(String n,int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

// Parameterized Constructor:
class ParameterizedStudentConstructor{
    String name;
    int age;
    ParameterizedStudentConstructor(String n,int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Main{
    public static void main(String[] args) {
        DefaultStudentConstructor S1 = new DefaultStudentConstructor();
        ParameterizedStudentConstructor S2 = new ParameterizedStudentConstructor("Bijoy",22);
        CopyStudentConstructor S3 = new CopyStudentConstructor("Sayan",19);
        CopyStudentConstructor S4 = S3;
        System.out.println("Default Student Constructor:");
        S1.display();
        System.out.println("Parameterized Student Constructor:");
        S2.display();
        System.out.println("Copy Student Constructor:");
        S4.display();
    }
}
```

### Constructor program - OUTPUT

```text
Default Student Constructor:
Aditya
20
Parameterized Student Constructor:
Bijoy
22
Copy Student Constructor:
Sayan
19
```

## 4. Method overloading simple example

### Method overloading program - Code

```java
// Calculator Code
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(10.5, 20.5));
    }
}
```

### Method overloading program - OUTPUT

```text
30
60
31.0
```

## 5. Constructor overloading

### Constructor overloading program - Code

```java
class Student{
    String name;
    int age;
    Student(){ // Constructor no.1:
        name = "unknown";
        age = 0;
    }
    Student(String n){ // Constructor no.2:
        name = n;
        age = 0;
    }
    Student(String n, int a){ // Constructor no.3:
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name + " " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1  = new Student();
        Student s2  = new Student("Adi");
        Student s3  = new Student("Aditya",100);
        s1.display();
        s2.display();
        s3.display();
    }    
}
```

### Constructor overloading program - OUTPUT

```text
unknown 0
Adi 0
Aditya 100
```

## 6. Bank Account – Method (Lab tart from here)

Jiya has opened a bank account. She wants a program that can deposit money into her account and display her updated balance.\
**Question**: *Write a Java program using a class BankAccount and a method deposit() to add money to the account and display the balance.*

### Bank Account – Method program - Code

```java
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

class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Jiya");
        a1.deposit(5000);
    }
}
```

### Bank Account – Method program - OUTPUT

```text
Jiya, Rs.5000 has been credited to your account
Your updated balance: 5000
```

## 7.  Shopping Bill – Method Overloading

Koushik goes shopping and buys different items. Sometimes he buys one item, sometimes two items, and sometimes three items.\
**Question**: *Write a Java program using method overloading to calculate the total bill using:*\
calculateBill (price)\
calculateBill (price1, price2)\
calculateBill (price1, price2, price3)

### Shopping Bill – Method Overloading program - Code

```java
class Main {
    static void calculateBill(double price) {
        System.out.println("Your total gross amount: " + price);
    }
    static void calculateBill(double price1, double price2) {
        System.out.println("Your total gross amount: " + (price1 + price2));
    }
    static void calculateBill(double price1, double price2, double price3) {
        System.out.println("Your total gross amount: " + (price1 + price2 + price3));
    }
    public static void main(String[] args) {
        calculateBill(10);
        calculateBill(10,20);
        calculateBill(10,20,30);
    }
}
```

### Shopping Bill – Method Overloading program - OUTPUT

```text
Your total gross amount: 10.0
Your total gross amount: 30.0
Your total gross amount: 60.0
```

## 8.  Student Details – Constructor

A school wants to store the details of its students. Whenever a new student is created, the student's name, roll number, and marks should be initialized automatically.\
**Question**: *Write a Java program using a constructor to initialize and display the details of a student.*

### Student Details – Constructor program - Code

```java
class CreateStudent {
    String name;
    int roll;
    double marks;
    CreateStudent(int r, String n, double m) {
        name = n;
        roll = r;
        marks = m;
    }
    void info() {
        System.out.println("\nStudent Name: " + name + "\nRoll: " + roll + "\nMarks: " + marks);
    }
}

class Main {
    public static void main(String[] args) {
        CreateStudent s1 = new CreateStudent(1, "Aditya Das", 50);
        s1.info();
    }
}
```

### Student Details – Constructor program - OUTPUT

```text
Student Name: Aditya Das
Roll: 1
Marks: 50.0
```

## 9.  Mobile Phone – Constructor Overloading

A mobile shop sells different phones. Some phones have only a brand name, while others have a brand name and price, and some have a brand name, price, and storage capacity.\
**Question**: *Write a Java program using constructor overloading to create mobile phone objects with different numbers of details.*

### Mobile Phone – Constructor Overloading program - Code

```java
class Mobile {
    String brandName;
    double price;
    int storage;
    Mobile(String name) {
        brandName = name;
        price = 1000;
        storage = 4;
    }
    Mobile(String name, double p) {
        brandName = name;
        price = p;
        storage = 128;
    }
    Mobile(String name, double p, int s) {
        brandName = name;
        price = p;
        storage = s;
    }
    void info() {
        System.out.print("\n-- Mobile Phone Info --\n");
        System.out.print("Brand Name: " + brandName + "\nPrice: RS." + price + "\nStorage: " + storage + "gb\n");
    }
}

class Main {
    public static void main(String[] args) {
        Mobile p1 = new Mobile("Nokia");
        Mobile p2 = new Mobile("Samsung", 50000);
        Mobile p3 = new Mobile("Iphone", 120000, 556);
        p1.info(); p2.info();  p3.info();
    }
}
```

### Mobile Phone – Constructor Overloading program - OUTPUT

```text
-- Mobile Phone Info --
Brand Name: Nokia
Price: RS.1000.0
Storage: 4gb

-- Mobile Phone Info --
Brand Name: Samsung
Price: RS.50000.0
Storage: 128gb

-- Mobile Phone Info --
Brand Name: Iphone
Price: RS.120000.0
Storage: 556gb
```

## 10.  Pizza Shop – Method \& Method Overloading

A pizza shop allows customers to order pizzas. The bill can be calculated for one pizza, two pizzas, or multiple pizzas with extra toppings.\
**Question**: *Write a Java program using method overloading to calculate the pizza bill for different types of orders. Display the final bill for each order.*

### Pizza Shop – Method \& Method Overloading program - Code

```java
class Pizza {
    double pizzaPrice = 0;

    void bill() {
        System.out.println("Your final bill: " + pizzaPrice + "\n");
    }
    void orderPizza(double price) {
        pizzaPrice += price;
        System.out.println("You ordered single pizza.");
        bill();
    }
    void orderPizza(double price1, double price2) {
        pizzaPrice += (price1 + price2);
        System.out.println("You ordered double pizza.");
        bill();
    }
    void orderPizza(double price1, double price2, double price3, double toppingsPrice) {
        pizzaPrice += (price1 + price2 + price3 + toppingsPrice);
        System.out.println("You ordered multiple pizzas with extra toppings.");
        bill();
    }
}

class Main {
    public static void main(String[] args) {
        Pizza c1 = new Pizza();
        Pizza c2 = new Pizza();
        Pizza c3 = new Pizza();
        c1.orderPizza(159);
        c2.orderPizza(159,179);
        c3.orderPizza(159,199,229,45);
    }
}
```

### Pizza Shop – Method \& Method Overloading program - OUTPUT

```text
You ordered single pizza.
Your final bill: 159.0

You ordered double pizza.
Your final bill: 338.0

You ordered multiple pizzas with extra toppings.
Your final bill: 632.0
```

## 11. Student Marks

*Write a Java program to demonstrate method overloading by creating a method calculateMarks() to*:\
Calculate marks of 1 subject.\
Calculate total marks of 3 subjects.\
Calculate total marks of 5 subjects.

### Student Marks program - Code

```java
class Main {
    static void calculateMarks(double subject1) {
        System.out.println("Total Marks: " + subject1);
    }
    static void calculateMarks(double subject1, double subject2, double subject3) {
        System.out.println("Total Marks: " + (subject1 + subject2 + subject3));
    }
    static void calculateMarks(double subject1, double subject2, double subject3, double subject4, double subject5) {
        System.out.println("Total Marks: " + (subject1 + subject2 + subject3 + subject4 + subject5));
    }
    public static void main(String[] args) {
        calculateMarks(80);
        calculateMarks(60, 80, 95);
        calculateMarks(70, 55, 77, 90, 99);
    }
}
```

### Student Marks program - OUTPUT

```text
Total Marks: 80.0
Total Marks: 235.0
Total Marks: 391.0
```

## 12. Calculator

*Write a Java program to demonstrate method overloading using a method add() to:*\
Add two integers.\
Add three integers.\
Add two double values.

### Calculator program - Code

```java
class Main {
    static void add(int a,int b){
        System.out.println("Sum of two integers: "+(a+b));
    }
    static void add(int a,int b,int c){
        System.out.println("Sum of three integers: "+(a+b+c));
    }
    static void add(double a,double b){
        System.out.println("Sum of two double values: "+(a+b));
    }
    public static void main(String[] args) {
        add(5,5); add(5, 5, 5);
        add(2.5, 2.5);
    }
}
```

### Calculator program - OUTPUT

```text
Sum of two integers: 10
Sum of three integers: 15
Sum of two double values: 5.0
```

## 13. Area Calculation

*Write a Java program to demonstrate method overloading using a method area() to calculate:*\
Area of a square.\
Area of a rectangle.\
Area of a circle.

### Area Calculation program - Code

```java
class Main {
    static void area(float side) {
        System.out.println("Area of a square: " + (side * side));
    }
    static void area(float length, float width) {
        System.out.println("Area of a rectangle: " + (length * width));
    }
    static void area(double radius) {
        System.out.printf("Area of a circle: %.2f",(Math.PI * radius * radius));
    }
    public static void main(String[] args) {
        area(5);
        area(2, 5);
        area(3.3);
    }
}
```

### Area Calculation program - OUTPUT

```text
Area of a square: 25.0
Area of a rectangle: 10.0
Area of a circle: 34.21
```

## 14. Employee Salary

*Write a Java program to demonstrate method overloading using a method salary() to calculate:*\
Salary using basic salary.\
Salary using basic salary and bonus.\
Salary using basic salary, bonus, and allowance.

### Employee Salary program - Code

```java
class Main {
    static void salary(double basicSalary){
        System.out.println("Total Income: "+basicSalary);
    }
    static void salary(double basicSalary,double bonus){
        System.out.println("Total Income: "+(basicSalary+bonus));
    }
    static void salary(double basicSalary,double bonus,double allowance){
        System.out.println("Total Income: "+(basicSalary+bonus+allowance));
    }
    public static void main(String[] args) {
        salary(50000);
        salary(50000,20000);
        salary(50000,20000,14000);
    }
}
```

### Employee Salary program - OUTPUT

```text
Total Income: 50000.0
Total Income: 70000.0
Total Income: 84000.0
```

## 15.  Volume Calculation

*Write a Java program to demonstrate method overloading using a method volume() to calculate:*\
Volume of a cube.\
Volume of a cuboid.\
Volume of a cylinder.

### Volume Calculation program - Code

```java
class Main {
    static void volume(double sideLength){
        System.out.println("Volume of a cube: "+(sideLength*sideLength*sideLength));
    }
    static void volume(double radius,double height){
        System.out.printf("Volume of a cylinder: %.2f",(Math.PI*radius*radius*height));
    }
    static void volume(double length,double width,double height){
        System.out.println("Volume of a cuboid: "+(length*width*height));
    }
    public static void main(String[] args) {
        volume(5);
        volume(4, 3, 7);
        volume(2, 7);
    }
}
```

### Volume Calculation program - OUTPUT

```text
Volume of a cube: 125.0
Volume of a cuboid: 84.0
Volume of a cylinder: 87.96
```

## 16. Compile-Time Polymorphism (Method Overloading)

### Compile-Time Polymorphism (Method Overloading) - Code

```java
class Calculator {
    // Overloaded method: handles 2 integers
    int add(int a, int b) {
        return a + b;
    }
    // Overloaded method: handles 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10)); // Calls the 2-parameter version
        System.out.println(calc.add(5, 10, 15)); // Calls the 3-parameter version

    }

}
```

### Compile-Time Polymorphism (Method Overloading) - OUTPUT

```text
15
30
```

## 17. Runtime Polymorphism (Method Overriding)

### Runtime Polymorphism (Method Overriding) - Code

```java
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks: Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Parent references pointing to Child objects (Upcasting)
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        // The JVM decides at runtime which overridden method to execute
        myDog.makeSound(); // Prints: The dog barks: Woof!
        myCat.makeSound(); // Prints: The cat meows: Meow!
    }
}
```

### Runtime Polymorphism (Method Overriding) - OUTPUT

```text
The dog barks: Woof!
The cat meows: Meow!
```

## 18. ATM Banking Simulation System

A bank wants to develop a simple ATM simulation program to help customers perform basic banking operations. Write a menu-driven Java program that allows a customer to perform the following operations:\
Check Account Balance.\
Deposit Money into the Account.\
Withdraw Money from the Account.\
Display Account Holder Details.\
Exit.\
Program requirements:\
Initially, the account should have a balance of ₹5,000.\
The user should be able to deposit any valid amount.\
The user should not be allowed to withdraw more money than the available balance.\
The program should display the updated balance after every deposit or withdrawal.\
The menu should continue to appear until the user selects Exit.

### ATM Banking Simulation System - Code

```java
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

class Main {
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
```

### ATM Banking Simulation System - OUTPUT

```text
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
```

## 19. Railway Ticket Reservation System

A railway reservation counter wants to develop a simple ticket booking application. Write a menu-driven Java program that allows passengers to perform the following operations:\
Display Available Train Details.\
Book a Train Ticket.\
Cancel a Train Ticket.\
Display Passenger Details.\
Check Available Seats.\
Exit.\
Program requirements:\
Maintain train details such as Train Number, Train Name, Source and Destination.\
Initially, assume that 50 seats are available.\
Accept passenger name, age and number of tickets during booking.\
Reduce the available seats after successful booking.\
Increase the available seats after successful cancellation.\
Do not allow booking if sufficient seats are unavailable.\
Display the passenger and booking details.\
Continue displaying the menu until the user selects Exit.

### Railway Ticket Reservation System - Code

```java
import java.util.Scanner;

class RailwayReservation {

    Scanner sc = new Scanner(System.in);

    int trainNumber = 12345;
    String trainName = "Express Train";
    String source = "Kolkata";
    String destination = "Delhi";

    int availableSeats = 50;

    String passengerName = "";
    int passengerAge;
    int bookedTickets = 0;
    boolean isBooked = false;

    // Display Train Details
    void displayTrainDetails() {
        System.out.println("\n----- TRAIN DETAILS -----");
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Available Seats: " + availableSeats);
    }

    // Book Train Ticket
    void bookTicket() {
        if (availableSeats == 0) {
            System.out.println("No seats available!");
            return;
        }
        if (isBooked) {
            System.out.println("A booking already exists. Cancel it before making another booking.");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();
        System.out.print("Enter Passenger Age: ");
        passengerAge = sc.nextInt();
        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();
        if (tickets > 0 && tickets <= availableSeats) {
            bookedTickets = tickets;
            availableSeats -= tickets;
            isBooked = true;
            System.out.println("\nTicket Booked Successfully!");
            System.out.println("Passenger Name: " + passengerName);
            System.out.println("Tickets Booked: " + bookedTickets);

        } else {
            System.out.println("Booking Failed! Insufficient seats or invalid ticket count.");
        }
    }

    // Cancel Train Ticket
    void cancelTicket() {
        if (!isBooked) {
            System.out.println("No booking found to cancel!");
            return;
        }
        availableSeats += bookedTickets;
        System.out.println("Ticket Cancelled Successfully!");
        System.out.println("Cancelled Tickets: " + bookedTickets);
        bookedTickets = 0;
        passengerName = "";
        passengerAge = 0;
        isBooked = false;
    }

    // Display Passenger Details
    void displayPassengerDetails() {
        if (!isBooked) {
            System.out.println("No passenger booking details available!");
            return;
        }
        System.out.println("\n----- PASSENGER DETAILS -----");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Passenger Age: " + passengerAge);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Number of Tickets: " + bookedTickets);
    }

    // Check Available Seats
    void checkAvailableSeats() {
        System.out.println("\nAvailable Seats: " + availableSeats);
    }
}

class Main{
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        RailwayReservation p1 = new RailwayReservation();
        do {
            System.out.println("\n===== RAILWAY RESERVATION SYSTEM =====");
            System.out.println("1. Display Train Details");
            System.out.println("2. Book Train Ticket");
            System.out.println("3. Cancel Train Ticket");
            System.out.println("4. Display Passenger Details");
            System.out.println("5. Check Available Seats");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    p1.displayTrainDetails();
                    break;
                case 2:
                    p1.bookTicket();
                    break;
                case 3:
                    p1.cancelTicket();
                    break;
                case 4:
                    p1.displayPassengerDetails();
                    break;
                case 5:
                    p1.checkAvailableSeats();
                    break;
                case 6:
                    System.out.println("Thank you for using Railway Reservation System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
        sc.close();
    }
}
```

### Railway Ticket Reservation System - OUTPUT

```text
===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 1

----- TRAIN DETAILS -----
Train Number: 12345
Train Name: Express Train
Source: Kolkata
Destination: Delhi
Available Seats: 50

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 2

Enter Passenger Name: Aditya Das
Enter Passenger Age: 20
Enter Number of Tickets: 5

Ticket Booked Successfully!
Passenger Name: Aditya Das
Tickets Booked: 5

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 4

----- PASSENGER DETAILS -----
Passenger Name: Aditya Das
Passenger Age: 20
Train Number: 12345
Train Name: Express Train
Number of Tickets: 5

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 5

Available Seats: 45

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 3
Ticket Cancelled Successfully!
Cancelled Tickets: 5

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 5

Available Seats: 50

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 6
Thank you for using Railway Reservation System!
```
