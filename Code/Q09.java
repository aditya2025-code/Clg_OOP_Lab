package Code;
// Q9.  Mobile Phone – Constructor Overloading
/*
A mobile shop sells different phones. Some phones have only a brand name, while others have a brand name and price, and some have a brand name, price, and storage capacity.
Question: Write a Java program using constructor overloading to create mobile phone objects with different numbers of details.
*/

class Mobile {
    String brandName;
    double price;
    int storage;
    Mobile(String name) {
        brandName = name;
        price = 1000;
        storage = 4;
    }
    Mobile(String name, double p) {
        brandName = name;
        price = p;
        storage = 128;
    }
    Mobile(String name, double p, int s) {
        brandName = name;
        price = p;
        storage = s;
    }
    void info() {
        System.out.print("\n-- Mobile Phone Info --\n");
        System.out.print("Brand Name: " + brandName + "\nPrice: RS." + price + "\nStorage: " + storage + "gb\n");
    }
}

class Q09 {
    public static void main(String[] args) {
        Mobile p1 = new Mobile("Nokia");
        Mobile p2 = new Mobile("Samsung", 50000);
        Mobile p3 = new Mobile("Iphone", 120000, 556);
        p1.info(); p2.info();  p3.info();
    }
}

// OUTPUT: 
/*
-- Mobile Phone Info --
Brand Name: Nokia
Price: RS.1000.0
Storage: 4gb

-- Mobile Phone Info --
Brand Name: Samsung
Price: RS.50000.0
Storage: 128gb

-- Mobile Phone Info --
Brand Name: Iphone
Price: RS.120000.0
Storage: 556gb
*/