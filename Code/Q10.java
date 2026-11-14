package Code;
// Q10. Pizza Shop – Method & Method Overloading
/*
A pizza shop allows customers to order pizzas. The bill can be calculated for one pizza, two pizzas, or multiple pizzas with extra toppings.
Question: Write a Java program using method overloading to calculate the pizza bill for different types of orders. Display the final bill for each order.
*/

class Pizza {
    double pizzaPrice = 0;

    void bill() {
        System.out.println("Your final bill: " + pizzaPrice + "\n");
    }
    void orderPizza(double price) {
        pizzaPrice += price;
        System.out.println("You ordered single pizza.");
        bill();
    }
    void orderPizza(double price1, double price2) {
        pizzaPrice += (price1 + price2);
        System.out.println("You ordered double pizza.");
        bill();
    }
    void orderPizza(double price1, double price2, double price3, double toppingsPrice) {
        pizzaPrice += (price1 + price2 + price3 + toppingsPrice);
        System.out.println("You ordered multiple pizzas with extra toppings.");
        bill();
    }
}

class Q10 {
    public static void main(String[] args) {
        Pizza c1 = new Pizza();
        Pizza c2 = new Pizza();
        Pizza c3 = new Pizza();
        c1.orderPizza(159);
        c2.orderPizza(159,179);
        c3.orderPizza(159,199,229,45);
    }
}

// OUTPUT:
/*
You ordered single pizza.
Your final bill: 159.0

You ordered double pizza.
Your final bill: 338.0

You ordered multiple pizzas with extra toppings.
Your final bill: 632.0
 */