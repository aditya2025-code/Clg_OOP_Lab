package Code2;
// Q5. Calculator Using Method Overloading

class Calculator {
    // Addition of two integers
    int add(int a, int b) {
        return a + b;
    }

    // Addition of two double values
    double add(double a, double b) {
        return a + b;
    }

    // Addition of three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Q05 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Sum of two integers: " + obj.add(10, 20));
        System.out.println("Sum of two doubles: " + obj.add(10.5, 20.5));
        System.out.println("Sum of three integers: " + obj.add(10, 20, 30));
    }
}

// OUTPUT:
/*
 * Sum of two integers: 30
 * Sum of two doubles: 31.0
 * Sum of three integers: 60
 */