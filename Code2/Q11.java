package Code2;
// Q11. Time Constructor Overloading

class Time {
    int hours, minutes;

    // No-argument Constructor
    Time() {
        hours = 0;
        minutes = 0;
    }

    // Constructor with Hours
    Time(int h) {
        hours = h;
        minutes = 0;
    }

    // Constructor with Hours and Minutes
    Time(int h, int m) {
        hours = h;
        minutes = m;
    }

    // Display Time
    void display() {
        System.out.println("Time: " + hours + " Hours " + minutes + " Minutes");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(5);
        Time t3 = new Time(10, 30);
        t1.display();
        t2.display();
        t3.display();
    }
}

// OUTPUT:
/*
 * Time: 0 Hours 0 Minutes
 * Time: 5 Hours 0 Minutes
 * Time: 10 Hours 30 Minutes
 */