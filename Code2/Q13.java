package Code2;
// Q13. Book Constructor Initialization

class Book {

    int bookId;
    String title, author;
    double price;

    // Default Constructor
    Book() {
        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(int id, String t, String a, double p) {
        bookId = id;
        title = t;
        author = a;
        price = p;
    }

    // Display Book Details
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("------------------");
    }
}

public class Q13 {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book(101, "Java Programming", "James Gosling", 500);

        b1.display();
        b2.display();
    }
}

//OUTPUT:
/*
Book ID: 0
Title: Unknown
Author: Unknown
Price: 0.0
------------------
Book ID: 101
Title: Java Programming
Author: James Gosling
Price: 500.0
------------------
*/