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

public class Q02 {
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

## 4. Method Overloading Demonstration

Analyze the following declarations: void display(int x), void display(double x), and void display(int x, int y). Explain why these methods demonstrate method overloading and write a Java program to invoke each overloaded method.

## 5. Calculator Using Method Overloading

Write a Java program to create a class Calculator containing overloaded methods named add() to perform addition of two integers, two double values, and three integers. Demonstrate all overloaded methods through suitable object calls.

## 6. Box Constructor Overloading

Create a Java class Box with data members length, breadth, and height. Implement constructor overloading using a no-argument constructor, a constructor for a cube, and a constructor for a cuboid. Calculate and display the volume for each object.

## 7. Overloaded Constructor Identification

Analyze the following code and identify the constructor that will be invoked for each object: Demo d1 = new Demo(); Demo d2 = new Demo(10); Demo d3 = new Demo(10, 20);. Explain how Java distinguishes between overloaded constructors.

## 8. Bank Account Constructor Overloading

Write a Java program to create a class BankAccount having accountNo, holderName, and balance. Implement constructor overloading using a default constructor and a parameterized constructor. Create objects using both constructors and display the account information.

## 9. Product Discount Calculation

Design a Java program to create a class Product with productId, productName, and price. Use constructor overloading to initialize objects either with default values or with all product details. Display the details and calculate the price after applying a 10% discount.

## 10. Valid Method Overloading Analysis

Analyze the following Java code and determine whether it represents valid method overloading: int calculate(int a, int b) and double calculate(int a, int b). If invalid, explain the reason and rewrite the methods so that valid overloading is achieved.

## 11. Time Constructor Overloading

Create a Java class Time with hours and minutes. Implement constructor overloading using a no-argument constructor, a constructor accepting hours, and a constructor accepting both hours and minutes. Display the time stored in each object.

## 12. Distance Constructor Overloading

Write a Java program to create a class Distance with data members meter and centimeter. Implement overloaded constructors to initialize distance using default values, only meters, and both meters and centimeters. Display the initialized distance.

## 13. Book Constructor Initialization

Design a Java class Book with bookId, title, author, and price. Implement a default constructor and a parameterized constructor. Create at least two objects using different constructors and display all book information.

## 14. Object Creation and Constructor Invocation

Analyze the following statement: Student s = new Student(101, "Rahul", 85);. Explain the role of the class name, reference variable, new operator, and constructor invocation in this statement. Illustrate your explanation with a suitable Java class.

## 15. Circle Area and Circumference

Write a Java program to create a class Circle with radius as a data member. Implement constructor overloading using a no-argument constructor and a parameterized constructor. Calculate and display the area and circumference for objects created using both constructors.

## 16. Mobile Constructor Overloading

Create a Java class Mobile with modelName, brand, and price. Implement constructor overloading using (i) a no-argument constructor, (ii) a constructor accepting brand and modelName, and (iii) a constructor accepting all three values. Display the details of objects created using each constructor.

## 17. Constructor Selection and Type Conversion

Analyze the following situation: A class contains constructors Demo(), Demo(int), and Demo(double). What will happen when objects are created using Demo(10), Demo(10.5), and Demo('A')? Explain constructor selection in each case.

## 18. Bank Account Deposit and Withdrawal

Design a Java program to create a class Account with accountNumber and balance. Implement a no-argument constructor and a parameterized constructor. Add methods for deposit and withdrawal and demonstrate the complete operation using an object initialized through the parameterized constructor.

## 19. Employee Multiple Constructor Implementation

Write a Java program to create a class Employee with overloaded constructors: one accepting only employee ID, one accepting employee ID and name, and one accepting employee ID, name, and salary. Create objects using all three constructors and display their values.

## 20. Student Admission Constructor Overloading

Create a Java class Admission with studentName, courseName, and admissionYear. Implement constructor overloading with a default constructor, a constructor accepting studentName and courseName, and a constructor accepting all three values. Create suitable objects and display their details.
