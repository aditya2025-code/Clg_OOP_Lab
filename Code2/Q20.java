package Code2;
// Q20. Student Admission Constructor Overloading

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

public class Q20 {
    public static void main(String[] args) {

        Admission a1 = new Admission();
        Admission a2 = new Admission("Aditya", "BCA");
        Admission a3 = new Admission("Rahul", "BCA", 2026);

        a1.display();
        a2.display();
        a3.display();
    }
}

//OUTPUT:
/*
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
*/