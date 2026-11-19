package Code2;
// Q10. Valid Method Overloading Analysis

class Calculator {
    // Addition of two integers
    int calculate(int a, int b) {
        return a + b;
    }

    // Addition of two double values
    double calculate(double a, double b) {
        return a + b;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Integer Result: " + obj.calculate(10, 20));
        System.out.println("Double Result: " + obj.calculate(10.5, 20.5));
    }
}

// OUTPUT:
/*
 * Integer Result: 30
 * Double Result: 31.0
 */