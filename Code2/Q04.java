package Code2;
// Q4. Method Overloading Demonstration

class Display {
    // Method with integer parameter
    void display(int x) {
        System.out.println("Integer: " + x);
    }

    // Method with double parameter
    void display(double x) {
        System.out.println("Double: " + x);
    }

    // Method with two integer parameters
    void display(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }
}

public class Q04 {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.display(10);
        obj.display(10.5);
        obj.display(10, 20);
    }
}

// OUTPUT:
/*
 * Integer: 10
 * Double: 10.5
 * Sum: 30
 */