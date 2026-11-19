package Code2;
// Q7. Overloaded Constructor Identification

class Demo {
    // No-argument Constructor
    Demo() {
        System.out.println("No-argument Constructor");
    }

    // One-parameter Constructor
    Demo(int x) {
        System.out.println("One-parameter Constructor: " + x);
    }

    // Two-parameter Constructor
    Demo(int x, int y) {
        System.out.println("Two-parameter Constructor: " + x + ", " + y);
    }
}

public class Q07 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(10);
        Demo d3 = new Demo(10, 20);
    }
}

// OUTPUT:
/*
 * No-argument Constructor
 * One-parameter Constructor: 10
 * Two-parameter Constructor: 10, 20
 */