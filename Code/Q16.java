package Code;
// Q16. Compile-Time Polymorphism (Method Overloading)

class Calculator {
    // Overloaded method: handles 2 integers
    int add(int a, int b) {
        return a + b;
    }
    // Overloaded method: handles 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Q16 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10)); // Calls the 2-parameter version
        System.out.println(calc.add(5, 10, 15)); // Calls the 3-parameter version

    }

}

//OUTPUT:
/*
15
30
*/