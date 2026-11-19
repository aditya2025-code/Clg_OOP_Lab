# JAVA PROGRAMMING – 5 MARKS QUESTION BANK

**Coverage:** Up to Introduction to Constructor Overloading

## 1. Student Class Using Parameterized Constructor

Design a Java program to create a class Student with data members rollNo, name, and marks. Implement a parameterized constructor to initialize these values and a method display() to print the student details. Create two objects and demonstrate their initialization.

### Student Class Using Parameterized Constructor - Code

```java
class Student {

    int rollNo;
    String name;
    double marks;

    // Parameterized Constructor
    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Display Student Details
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating two Student objects
        Student s1 = new Student(101, "Aditya", 85.5);
        Student s2 = new Student(102, "Rahul", 90.0);

        // Displaying Student Details
        s1.display();
        s2.display();
    }
}
```

### Student Class Using Parameterized Constructor - OUTPUT

```text
Roll Number: 101
Name: Aditya
Marks: 85.5
----------------------
Roll Number: 102
Name: Rahul
Marks: 90.0
----------------------
```

## 2. Employee Constructor Overloading

Design a Java program to create a class Employee with data members empId, name, and salary. Use a no-argument constructor to initialize default values and a parameterized constructor to initialize user-supplied values. Create objects using both constructors and display their details.

### Employee Constructor Overloading - Code

```java
class Employee {

    int empId;
    String name;
    double salary;

    // No-argument Constructor
    Employee() {
        empId = 0;
        name = "Unknown";
        salary = 0.0;
    }

    // Parameterized Constructor
    Employee(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    // Display Employee Details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects using both constructors
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Aditya", 25000.0);
        // Displaying Employee Details
        e1.display();
        e2.display();
    }
}
```

### Employee Constructor Overloading - OUTPUT

```text
Employee ID: 0
Name: Unknown
Salary: 0.0
----------------------
Employee ID: 101
Name: Aditya
Salary: 25000.0
----------------------
```

## 3. Rectangle Constructor Overloading

Create a Java class Rectangle using constructor overloading. Implement (i) a no-argument constructor, (ii) a constructor accepting one value to represent a square, and (iii) a constructor accepting length and breadth. Calculate and display the area for objects created using all three constructors.

### Rectangle Constructor Overloading - Code

```java
class Rectangle {
    double length, breadth;

    // No-argument Constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Square Constructor
    Rectangle(double side) {
        length = breadth = side;
    }

    // Rectangle Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + (length * breadth));
        System.out.println("------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(10, 5);
        r1.display();
        r2.display();
        r3.display();
    }
}
```

### Rectangle Constructor Overloading - OUTPUT

```text
Length: 0.0
Breadth: 0.0
Area: 0.0
------------------
Length: 5.0
Breadth: 5.0
Area: 25.0
------------------
Length: 10.0
Breadth: 5.0
Area: 50.0
------------------
```

## 4. Method Overloading Demonstration

Analyze the following declarations: void display(int x), void display(double x), and void display(int x, int y). Explain why these methods demonstrate method overloading and write a Java program to invoke each overloaded method.

### Method Overloading Demonstration - Code

```java
class Display {
    // Method with integer parameter
    void display(int x) {
        System.out.println("Integer: " + x);
    }

    // Method with double parameter
    void display(double x) {
        System.out.println("Double: " + x);
    }

    // Method with two integer parameters
    void display(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }
}

public class Main {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.display(10);
        obj.display(10.5);
        obj.display(10, 20);
    }
}
```

### Method Overloading Demonstration - OUTPUT

```text
Integer: 10
Double: 10.5
Sum: 30
```

## 5. Calculator Using Method Overloading

Write a Java program to create a class Calculator containing overloaded methods named add() to perform addition of two integers, two double values, and three integers. Demonstrate all overloaded methods through suitable object calls.

### Calculator Using Method Overloading - Code

```java
class Calculator {
    // Addition of two integers
    int add(int a, int b) {
        return a + b;
    }

    // Addition of two double values
    double add(double a, double b) {
        return a + b;
    }

    // Addition of three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Sum of two integers: " + obj.add(10, 20));
        System.out.println("Sum of two doubles: " + obj.add(10.5, 20.5));
        System.out.println("Sum of three integers: " + obj.add(10, 20, 30));
    }
}
```

### Calculator Using Method Overloading - OUTPUT

```text
Sum of two integers: 30
Sum of two doubles: 31.0
Sum of three integers: 60
```

## 6. Box Constructor Overloading

Create a Java class Box with data members length, breadth, and height. Implement constructor overloading using a no-argument constructor, a constructor for a cube, and a constructor for a cuboid. Calculate and display the volume for each object.

### Box Constructor Overloading - Code

```java
class Box {
    double length, breadth, height;

    // No-argument Constructor
    Box() {
        length = breadth = height = 0;
    }

    // Cube Constructor
    Box(double side) {
        length = breadth = height = side;
    }

    // Cuboid Constructor
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Calculate and Display Volume
    void display() {
        System.out.println("Volume: " + (length * breadth * height));
        System.out.println("------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(10, 5, 4);
        b1.display();
        b2.display();
        b3.display();
    }
}
```

### Box Constructor Overloading - OUTPUT

```text
Volume: 0.0
------------------
Volume: 125.0
------------------
Volume: 200.0
------------------
```

## 7. Overloaded Constructor Identification

Analyze the following code and identify the constructor that will be invoked for each object: Demo d1 = new Demo(); Demo d2 = new Demo(10); Demo d3 = new Demo(10, 20);. Explain how Java distinguishes between overloaded constructors.

### Overloaded Constructor Identification - Code

```java
class Demo {
    // No-argument Constructor
    Demo() {
        System.out.println("No-argument Constructor");
    }

    // One-parameter Constructor
    Demo(int x) {
        System.out.println("One-parameter Constructor: " + x);
    }

    // Two-parameter Constructor
    Demo(int x, int y) {
        System.out.println("Two-parameter Constructor: " + x + ", " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(10);
        Demo d3 = new Demo(10, 20);
    }
}
```

### Overloaded Constructor Identification - OUTPUT

```text
No-argument Constructor
One-parameter Constructor: 10
Two-parameter Constructor: 10, 20
```

## 8. Bank Account Constructor Overloading

Write a Java program to create a class BankAccount having accountNo, holderName, and balance. Implement constructor overloading using a default constructor and a parameterized constructor. Create objects using both constructors and display the account information.

### Bank Account Constructor Overloading - Code

```java
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

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(101, "Aditya", 5000);
        b1.display();
        b2.display();
    }
}
```

### Bank Account Constructor Overloading - OUTPUT

```text
Account No: 0
Holder Name: Unknown
Balance: 0.0
------------------
Account No: 101
Holder Name: Aditya
Balance: 5000.0
------------------
```

## 9. Product Discount Calculation

Design a Java program to create a class Product with productId, productName, and price. Use constructor overloading to initialize objects either with default values or with all product details. Display the details and calculate the price after applying a 10% discount.

### Product Discount Calculation - Code

```java
class Product {
    int productId;
    String productName;
    double price;

    // Default Constructor
    Product() {
        productId = 0;
        productName = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Product(int id, String name, double p) {
        productId = id;
        productName = name;
        price = p;
    }

    // Display Product Details
    void display() {
        double discountPrice = price - (price * 0.10);
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: " + price);
        System.out.println("Price After 10% Discount: " + discountPrice);
        System.out.println("------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", 50000);
        p1.display();
        p2.display();
    }
}
```

### Product Discount Calculation - OUTPUT

```text
Product ID: 0
Product Name: Unknown
Original Price: 0.0
Price After 10% Discount: 0.0
------------------
Product ID: 101
Product Name: Laptop
Original Price: 50000.0
Price After 10% Discount: 45000.0
------------------
```

## 10. Valid Method Overloading Analysis

Analyze the following Java code and determine whether it represents valid method overloading: int calculate(int a, int b) and double calculate(int a, int b). If invalid, explain the reason and rewrite the methods so that valid overloading is achieved.

### Valid Method Overloading Analysis - Code

```java
class Calculator {
    // Addition of two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Addition of two double values
    double calculate(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Integer Result: " + obj.calculate(10, 20));
        System.out.println("Double Result: " + obj.calculate(10.5, 20.5));
    }
}
```

### Valid Method Overloading Analysis - OUTPUT

```text
Integer Result: 30
Double Result: 31.0
```

## 11. Time Constructor Overloading

Create a Java class Time with hours and minutes. Implement constructor overloading using a no-argument constructor, a constructor accepting hours, and a constructor accepting both hours and minutes. Display the time stored in each object.

### Time Constructor Overloading - Code

```java
class Time {
    int hours, minutes;

    // No-argument Constructor
    Time() {
        hours = 0;
        minutes = 0;
    }

    // Constructor with Hours
    Time(int h) {
        hours = h;
        minutes = 0;
    }

    // Constructor with Hours and Minutes
    Time(int h, int m) {
        hours = h;
        minutes = m;
    }

    // Display Time
    void display() {
        System.out.println("Time: " + hours + " Hours " + minutes + " Minutes");
    }
}

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(5);
        Time t3 = new Time(10, 30);
        t1.display();
        t2.display();
        t3.display();
    }
}
```

### Time Constructor Overloading - OUTPUT

```text
Time: 0 Hours 0 Minutes
Time: 5 Hours 0 Minutes
Time: 10 Hours 30 Minutes
```

## 12. Distance Constructor Overloading

Write a Java program to create a class Distance with data members meter and centimeter. Implement overloaded constructors to initialize distance using default values, only meters, and both meters and centimeters. Display the initialized distance.

### Distance Constructor Overloading - Code

```java
class Distance {

    int meter, centimeter;

    // No-argument Constructor
    Distance() {
        meter = 0;
        centimeter = 0;
    }

    // Constructor with Meters
    Distance(int m) {
        meter = m;
        centimeter = 0;
    }

    // Constructor with Meters and Centimeters
    Distance(int m, int cm) {
        meter = m;
        centimeter = cm;
    }

    // Display Distance
    void display() {
        System.out.println("Distance: " + meter + " Meter " + centimeter + " Centimeter");
    }
}

public class Main {
    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance(5);
        Distance d3 = new Distance(10, 50);

        d1.display();
        d2.display();
        d3.display();
    }
}
```

### Distance Constructor Overloading - OUTPUT

```text
Distance: 0 Meter 0 Centimeter
Distance: 5 Meter 0 Centimeter
Distance: 10 Meter 50 Centimeter
```

## 13. Book Constructor Initialization

Design a Java class Book with bookId, title, author, and price. Implement a default constructor and a parameterized constructor. Create at least two objects using different constructors and display all book information.

### Book Constructor Initialization - Code

```java
class Book {

    int bookId;
    String title, author;
    double price;

    // Default Constructor
    Book() {
        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(int id, String t, String a, double p) {
        bookId = id;
        title = t;
        author = a;
        price = p;
    }

    // Display Book Details
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book(101, "Java Programming", "James Gosling", 500);

        b1.display();
        b2.display();
    }
}
```

### Book Constructor Initialization - OUTPUT

```text
Book ID: 0
Title: Unknown
Author: Unknown
Price: 0.0
------------------
Book ID: 101
Title: Java Programming
Author: James Gosling
Price: 500.0
------------------
```

## 14. Object Creation and Constructor Invocation

Analyze the following statement: Student s = new Student(101, "Rahul", 85);. Explain the role of the class name, reference variable, new operator, and constructor invocation in this statement. Illustrate your explanation with a suitable Java class.

### Object Creation and Constructor Invocation - Code

```java
class Student {

    int rollNo, marks;
    String name;

    // Parameterized Constructor
    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Display Student Details
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student(101, "Rahul", 85);

        s.display();
    }
}
```

### Object Creation and Constructor Invocation - OUTPUT

```text
Roll Number: 101
Name: Rahul
Marks: 85
```

## 15. Circle Area and Circumference

Write a Java program to create a class Circle with radius as a data member. Implement constructor overloading using a no-argument constructor and a parameterized constructor. Calculate and display the area and circumference for objects created using both constructors.

### Circle Area and Circumference - Code

```java
class Circle {

    double radius;

    // No-argument Constructor
    Circle() {
        radius = 0;
    }

    // Parameterized Constructor
    Circle(double r) {
        radius = r;
    }

    // Calculate and Display Area and Circumference
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (3.14 * radius * radius));
        System.out.println("Circumference: " + (2 * 3.14 * radius));
        System.out.println("------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        c1.display();
        c2.display();
    }
}
```

### Circle Area and Circumference - OUTPUT

```text
Radius: 0.0
Area: 0.0
Circumference: 0.0
------------------
Radius: 5.0
Area: 78.5
Circumference: 31.400000000000002
------------------
```

## 16. Mobile Constructor Overloading

Create a Java class Mobile with modelName, brand, and price. Implement constructor overloading using (i) a no-argument constructor, (ii) a constructor accepting brand and modelName, and (iii) a constructor accepting all three values. Display the details of objects created using each constructor.

### Mobile Constructor Overloading - Code

```java
class Mobile {

    String modelName, brand;
    double price;

    // No-argument Constructor
    Mobile() {
        modelName = "Unknown";
        brand = "Unknown";
        price = 0.0;
    }

    // Constructor with Brand and Model Name
    Mobile(String b, String m) {
        brand = b;
        modelName = m;
        price = 0.0;
    }

    // Parameterized Constructor
    Mobile(String b, String m, double p) {
        brand = b;
        modelName = m;
        price = p;
    }

    // Display Mobile Details
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("Price: " + price);
        System.out.println("------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung", "Galaxy A55");
        Mobile m3 = new Mobile("Apple", "iPhone 16", 80000);

        m1.display();
        m2.display();
        m3.display();
    }
}
```

### Mobile Constructor Overloading - OUTPUT

```text
Brand: Unknown
Model: Unknown
Price: 0.0
------------------
Brand: Samsung
Model: Galaxy A55
Price: 0.0
------------------
Brand: Apple
Model: iPhone 16
Price: 80000.0
------------------
```

## 17. Constructor Selection and Type Conversion

Analyze the following situation: A class contains constructors Demo(), Demo(int), and Demo(double). What will happen when objects are created using Demo(10), Demo(10.5), and Demo('A')? Explain constructor selection in each case.

### Constructor Selection and Type Conversion - Code

```java
class Demo {

    // No-argument Constructor
    Demo() {
        System.out.println("No-argument Constructor");
    }

    // Integer Constructor
    Demo(int x) {
        System.out.println("Integer Constructor: " + x);
    }

    // Double Constructor
    Demo(double x) {
        System.out.println("Double Constructor: " + x);
    }
}

public class Main {
    public static void main(String[] args) {

        Demo d1 = new Demo(10);
        Demo d2 = new Demo(10.5);
        Demo d3 = new Demo('A');
    }
}
```

### Constructor Selection and Type Conversion - OUTPUT

```text
Integer Constructor: 10
Double Constructor: 10.5
Integer Constructor: 65
```

## 18. Bank Account Deposit and Withdrawal

Design a Java program to create a class Account with accountNumber and balance. Implement a no-argument constructor and a parameterized constructor. Add methods for deposit and withdrawal and demonstrate the complete operation using an object initialized through the parameterized constructor.

### Bank Account Deposit and Withdrawal - Code

```java
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

public class Main {
    public static void main(String[] args) {

        Account a1 = new Account(101, 5000);

        a1.display();
        a1.deposit(2000);
        a1.withdraw(1000);

        System.out.println("------------------");
        a1.display();
    }
}
```

### Bank Account Deposit and Withdrawal - OUTPUT

```text
Account Number: 101
Balance: 5000.0
Deposited: 2000.0
Withdrawn: 1000.0
------------------
Account Number: 101
Balance: 6000.0
```

## 19. Employee Multiple Constructor Implementation

Write a Java program to create a class Employee with overloaded constructors: one accepting only employee ID, one accepting employee ID and name, and one accepting employee ID, name, and salary. Create objects using all three constructors and display their values.

### Employee Multiple Constructor Implementation - Code

```java
class Employee {

    int empId;
    String name;
    double salary;

    // Constructor with Employee ID
    Employee(int id) {
        empId = id;
        name = "Unknown";
        salary = 0.0;
    }

    // Constructor with ID and Name
    Employee(int id, String n) {
        empId = id;
        name = n;
        salary = 0.0;
    }

    // Constructor with All Details
    Employee(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    // Display Employee Details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102, "Rahul");
        Employee e3 = new Employee(103, "Aditya", 30000);

        e1.display();
        e2.display();
        e3.display();
    }
}
```

### Employee Multiple Constructor Implementation - OUTPUT

```text
Employee ID: 101
Name: Unknown
Salary: 0.0
------------------
Employee ID: 102
Name: Rahul
Salary: 0.0
------------------
Employee ID: 103
Name: Aditya
Salary: 30000.0
------------------
```

## 20. Student Admission Constructor Overloading

Create a Java class Admission with studentName, courseName, and admissionYear. Implement constructor overloading with a default constructor, a constructor accepting studentName and courseName, and a constructor accepting all three values. Create suitable objects and display their details.

### Student Admission Constructor Overloading - Code

```java
class Admission {

    String studentName, courseName;
    int admissionYear;

    // Default Constructor
    Admission() {
        studentName = "Unknown";
        courseName = "Not Assigned";
        admissionYear = 0;
    }

    // Two-Parameter Constructor
    Admission(String s, String c) {
        studentName = s;
        courseName = c;
        admissionYear = 0;
    }

    // Three-Parameter Constructor
    Admission(String s, String c, int y) {
        studentName = s;
        courseName = c;
        admissionYear = y;
    }

    void display() {
        System.out.println("Student: " + studentName);
        System.out.println("Course: " + courseName);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Admission a1 = new Admission();
        Admission a2 = new Admission("Aditya", "BCA");
        Admission a3 = new Admission("Rahul", "BCA", 2026);

        a1.display();
        a2.display();
        a3.display();
    }
}
```

### Student Admission Constructor Overloading - OUTPUT

```text
Student: Unknown
Course: Not Assigned
Admission Year: 0
--------------------
Student: Aditya
Course: BCA
Admission Year: 0
--------------------
Student: Rahul
Course: BCA
Admission Year: 2026
--------------------
```
