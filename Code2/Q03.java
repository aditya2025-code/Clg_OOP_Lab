package Code2;
// Q3. Rectangle Constructor Overloading:

class Rectangle {
    double length, breadth;

    // No-argument Constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Square Constructor
    Rectangle(double side) {
        length = breadth = side;
    }

    // Rectangle Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + (length * breadth));
        System.out.println("------------------");
    }
}

public class Q03 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(10, 5);
        r1.display();
        r2.display();
        r3.display();
    }
}

// OUTPUT:
/*
Length: 0.0
Breadth: 0.0
Area: 0.0
------------------
Length: 5.0
Breadth: 5.0
Area: 25.0
------------------
Length: 10.0
Breadth: 5.0
Area: 50.0
------------------
 */