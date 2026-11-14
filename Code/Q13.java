package Code;
// Q13. Area Calculation
/*
Write a Java program to demonstrate method overloading using a method area() to calculate:
Area of a square.
Area of a rectangle.
Area of a circle.
*/

class Q13 {
    static void area(float side) {
        System.out.println("Area of a square: " + (side * side));
    }
    static void area(float length, float width) {
        System.out.println("Area of a rectangle: " + (length * width));
    }
    static void area(double radius) {
        System.out.printf("Area of a circle: %.2f",(Math.PI * radius * radius));
    }
    public static void main(String[] args) {
        area(5);
        area(2, 5);
        area(3.3);
    }
}

// OUTPUT:
/*
Area of a square: 25.0
Area of a rectangle: 10.0
Area of a circle: 34.21
*/