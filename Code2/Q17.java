package Code2;
// Q17. Constructor Selection and Type Conversion

class Demo {

    // No-argument Constructor
    Demo() {
        System.out.println("No-argument Constructor");
    }

    // Integer Constructor
    Demo(int x) {
        System.out.println("Integer Constructor: " + x);
    }

    // Double Constructor
    Demo(double x) {
        System.out.println("Double Constructor: " + x);
    }
}

public class Q17 {
    public static void main(String[] args) {

        Demo d1 = new Demo(10);
        Demo d2 = new Demo(10.5);
        Demo d3 = new Demo('A');
    }
}

// OUTPUT:
/*
Integer Constructor: 10
Double Constructor: 10.5
Integer Constructor: 65
*/