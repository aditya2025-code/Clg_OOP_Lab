package Code2;
// Q14. Object Creation and Constructor Invocation

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

public class Q14 {
    public static void main(String[] args) {

        Student s = new Student(101, "Rahul", 85);

        s.display();
    }
}

//OUTPUT:
/*
Roll Number: 101
Name: Rahul
Marks: 85
*/