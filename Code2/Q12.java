package Code2;
// Q12. Distance Constructor Overloading

class Distance {

    int meter, centimeter;

    // No-argument Constructor
    Distance() {
        meter = 0;
        centimeter = 0;
    }

    // Constructor with Meters
    Distance(int m) {
        meter = m;
        centimeter = 0;
    }

    // Constructor with Meters and Centimeters
    Distance(int m, int cm) {
        meter = m;
        centimeter = cm;
    }

    // Display Distance
    void display() {
        System.out.println("Distance: " + meter + " Meter " + centimeter + " Centimeter");
    }
}

public class Q12 {
    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance(5);
        Distance d3 = new Distance(10, 50);

        d1.display();
        d2.display();
        d3.display();
    }
}

//OUTPUT:
/*
Distance: 0 Meter 0 Centimeter
Distance: 5 Meter 0 Centimeter
Distance: 10 Meter 50 Centimeter
*/