package Code;
// Q7. Shopping Bill – Method Overloading
/*
Koushik goes shopping and buys different items. Sometimes he buys one item, sometimes two items, and sometimes three items.
Question: Write a Java program using method overloading to calculate the total bill using:
            calculateBill(price)
            calculateBill(price1, price2)
            calculateBill(price1, price2, price3)
*/
class Q07 {
    static void calculateBill(double price) {
        System.out.println("Your total gross amount: " + price);
    }
    static void calculateBill(double price1, double price2) {
        System.out.println("Your total gross amount: " + (price1 + price2));
    }
    static void calculateBill(double price1, double price2, double price3) {
        System.out.println("Your total gross amount: " + (price1 + price2 + price3));
    }
    public static void main(String[] args) {
        calculateBill(10);
        calculateBill(10,20);
        calculateBill(10,20,30);
    }
}

// OUTPUT:
/*
Your total gross amount: 10.0
Your total gross amount: 30.0
Your total gross amount: 60.0
*/