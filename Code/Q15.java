package Code;
// Q15.  Volume Calculation
/*
Write a Java program to demonstrate method overloading using a method volume() to calculate:
Volume of a cube.
Volume of a cuboid.
Volume of a cylinder.
*/

class Q15 {
    static void volume(double sideLength){
        System.out.println("Volume of a cube: "+(sideLength*sideLength*sideLength));
    }
    static void volume(double radius,double height){
        System.out.printf("Volume of a cylinder: %.2f",(Math.PI*radius*radius*height));
    }
    static void volume(double length,double width,double height){
        System.out.println("Volume of a cuboid: "+(length*width*height));
    }
    public static void main(String[] args) {
        volume(5);
        volume(4, 3, 7);
        volume(2, 7);
    }
}

// OUTPUT:
/*
Volume of a cube: 125.0
Volume of a cuboid: 84.0
Volume of a cylinder: 87.96
*/