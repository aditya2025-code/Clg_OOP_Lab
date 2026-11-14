package Code;
// Q2. Palindrome Checker:

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int originalNumber = scanner.nextInt();

        // Keep a copy of the original number since we will modify 'num'
        int num = originalNumber;
        int reversedNumber = 0;

        // Reverse the number mathematically
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            num = num / 10;
        }

        // Compare the reversed number with the original number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close();
    }
}

// OUTPUT:
/*
Enter an integer: 1221
1221 is a palindrome.
*/