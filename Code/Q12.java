package Code;
// Q12. Calculator
/*
Write a Java program to demonstrate method overloading using a method add() to:
Add two integers.
Add three integers.
Add two double values.
*/

class Q12 {
    static void add(int a,int b){
        System.out.println("Sum of two integers: "+(a+b));
    }
    static void add(int a,int b,int c){
        System.out.println("Sum of three integers: "+(a+b+c));
    }
    static void add(double a,double b){
        System.out.println("Sum of two double values: "+(a+b));
    }
    public static void main(String[] args) {
        add(5,5); add(5, 5, 5);
        add(2.5, 2.5);
    }
}

// OUTPUT:
/*
Sum of two integers: 10
Sum of three integers: 15
Sum of two double values: 5.0
*/