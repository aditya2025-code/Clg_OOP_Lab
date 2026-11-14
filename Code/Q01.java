package Code;
// Q1.  Input-Output:

import java.util.Scanner;

class Q01 {
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

// OUTPUT:
/*
  Enter name, age and salary:
  Aditya
  20
  1
  Name: Aditya
  Age: 20
  Salary: 1.0
 */