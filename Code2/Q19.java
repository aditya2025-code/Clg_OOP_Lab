package Code2;
// Q19. Employee Multiple Constructor Implementation

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

public class Q19 {
    public static void main(String[] args) {

        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102, "Rahul");
        Employee e3 = new Employee(103, "Aditya", 30000);

        e1.display();
        e2.display();
        e3.display();
    }
}

//OUTPUT:
/*
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
*/