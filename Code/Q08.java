package Code;
// Q8. Student Details – Constructor
/*
A school wants to store the details of its students. Whenever a new student is created, the student's name, roll number, and marks should be initialized automatically.
Question: Write a Java program using a constructor to initialize and display the details of a student.
*/

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

class Q08 {
    public static void main(String[] args) {
        CreateStudent s1 = new CreateStudent(1, "Aditya Das", 50);
        s1.info();
    }
}

// OUTPUT:
/*
Student Name: Aditya Das
Roll: 1
Marks: 50.0
*/