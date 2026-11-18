package Code2;
// Q1.Student Class Using Parameterized Constructor:

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

public class Q01 {
    public static void main(String[] args) {

        // Creating two Student objects
        Student s1 = new Student(101, "Aditya", 85.5);
        Student s2 = new Student(102, "Rahul", 90.0);

        // Displaying Student Details
        s1.display();
        s2.display();
    }
}

//OUTPUT:
/*
Roll Number: 101
Name: Aditya
Marks: 85.5
----------------------
Roll Number: 102
Name: Rahul
Marks: 90.0
----------------------
*/