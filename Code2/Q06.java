package Code2;
// Q6. Box Constructor Overloading

class Box {
    double length, breadth, height;

    // No-argument Constructor
    Box() {
        length = breadth = height = 0;
    }

    // Cube Constructor
    Box(double side) {
        length = breadth = height = side;
    }

    // Cuboid Constructor
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Calculate and Display Volume
    void display() {
        System.out.println("Volume: " + (length * breadth * height));
        System.out.println("------------------");
    }
}

public class Q06 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(10, 5, 4);
        b1.display();
        b2.display();
        b3.display();
    }
}

// OUTPUT:
/*
 * Volume: 0.0
 * ------------------
 * Volume: 125.0
 * ------------------
 * Volume: 200.0
 * ------------------
 */