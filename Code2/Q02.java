package Code2;
// Q2. Employee Constructor Overloading

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

//OUTPUT:
/*
Employee ID: 0
Name: Unknown
Salary: 0.0
----------------------
Employee ID: 101
Name: Aditya
Salary: 25000.0
----------------------
*/