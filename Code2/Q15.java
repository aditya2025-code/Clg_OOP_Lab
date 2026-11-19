package Code2;
// Q15. Circle Area and Circumference

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

public class Q15 {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        c1.display();
        c2.display();
    }
}

//OUTPUT:
/*
Radius: 0.0
Area: 0.0
Circumference: 0.0
------------------
Radius: 5.0
Area: 78.5
Circumference: 31.400000000000002
------------------
*/