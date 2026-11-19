package Code2;
// Q9. Product Discount Calculation

class Product {
    int productId;
    String productName;
    double price;

    // Default Constructor
    Product() {
        productId = 0;
        productName = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Product(int id, String name, double p) {
        productId = id;
        productName = name;
        price = p;
    }

    // Display Product Details
    void display() {
        double discountPrice = price - (price * 0.10);
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: " + price);
        System.out.println("Price After 10% Discount: " + discountPrice);
        System.out.println("------------------");
    }
}

public class Q09 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", 50000);
        p1.display();
        p2.display();
    }
}

// OUTPUT:
/*
 * Product ID: 0
 * Product Name: Unknown
 * Original Price: 0.0
 * Price After 10% Discount: 0.0
 * ------------------
 * Product ID: 101
 * Product Name: Laptop
 * Original Price: 50000.0
 * Price After 10% Discount: 45000.0
 * ------------------
 */