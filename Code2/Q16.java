package Code2;
// Q16. Mobile Constructor Overloading

class Mobile {

    String modelName, brand;
    double price;

    // No-argument Constructor
    Mobile() {
        modelName = "Unknown";
        brand = "Unknown";
        price = 0.0;
    }

    // Constructor with Brand and Model Name
    Mobile(String b, String m) {
        brand = b;
        modelName = m;
        price = 0.0;
    }

    // Parameterized Constructor
    Mobile(String b, String m, double p) {
        brand = b;
        modelName = m;
        price = p;
    }

    // Display Mobile Details
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("Price: " + price);
        System.out.println("------------------");
    }
}

public class Q16 {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung", "Galaxy A55");
        Mobile m3 = new Mobile("Apple", "iPhone 16", 80000);

        m1.display();
        m2.display();
        m3.display();
    }
}

//OUTPUT:
/*
Brand: Unknown
Model: Unknown
Price: 0.0
------------------
Brand: Samsung
Model: Galaxy A55
Price: 0.0
------------------
Brand: Apple
Model: iPhone 16
Price: 80000.0
------------------
*/