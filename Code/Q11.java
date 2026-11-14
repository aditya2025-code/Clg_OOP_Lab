package Code;
// Q11. Student Marks
/*
Write a Java program to demonstrate method overloading by creating a method calculateMarks() to:
Calculate marks of 1 subject.
Calculate total marks of 3 subjects.
Calculate total marks of 5 subjects.
*/

class Q11 {
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

// OUTPUT:
/*
Total Marks: 80.0
Total Marks: 235.0
Total Marks: 391.0
*/