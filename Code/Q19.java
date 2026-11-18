package Code;
// Q19. Railway Ticket Reservation System:

import java.util.Scanner;

class RailwayReservation {

    Scanner sc = new Scanner(System.in);

    int trainNumber = 12345;
    String trainName = "Express Train";
    String source = "Kolkata";
    String destination = "Delhi";

    int availableSeats = 50;

    String passengerName = "";
    int passengerAge;
    int bookedTickets = 0;
    boolean isBooked = false;

    // Display Train Details
    void displayTrainDetails() {
        System.out.println("\n----- TRAIN DETAILS -----");
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Available Seats: " + availableSeats);
    }

    // Book Train Ticket
    void bookTicket() {
        if (availableSeats == 0) {
            System.out.println("No seats available!");
            return;
        }
        if (isBooked) {
            System.out.println("A booking already exists. Cancel it before making another booking.");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();
        System.out.print("Enter Passenger Age: ");
        passengerAge = sc.nextInt();
        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();
        if (tickets > 0 && tickets <= availableSeats) {
            bookedTickets = tickets;
            availableSeats -= tickets;
            isBooked = true;
            System.out.println("\nTicket Booked Successfully!");
            System.out.println("Passenger Name: " + passengerName);
            System.out.println("Tickets Booked: " + bookedTickets);

        } else {
            System.out.println("Booking Failed! Insufficient seats or invalid ticket count.");
        }
    }

    // Cancel Train Ticket
    void cancelTicket() {
        if (!isBooked) {
            System.out.println("No booking found to cancel!");
            return;
        }
        availableSeats += bookedTickets;
        System.out.println("Ticket Cancelled Successfully!");
        System.out.println("Cancelled Tickets: " + bookedTickets);
        bookedTickets = 0;
        passengerName = "";
        passengerAge = 0;
        isBooked = false;
    }

    // Display Passenger Details
    void displayPassengerDetails() {
        if (!isBooked) {
            System.out.println("No passenger booking details available!");
            return;
        }
        System.out.println("\n----- PASSENGER DETAILS -----");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Passenger Age: " + passengerAge);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Number of Tickets: " + bookedTickets);
    }

    // Check Available Seats
    void checkAvailableSeats() {
        System.out.println("\nAvailable Seats: " + availableSeats);
    }
}

class Q19{
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        RailwayReservation p1 = new RailwayReservation();
        do {
            System.out.println("\n===== RAILWAY RESERVATION SYSTEM =====");
            System.out.println("1. Display Train Details");
            System.out.println("2. Book Train Ticket");
            System.out.println("3. Cancel Train Ticket");
            System.out.println("4. Display Passenger Details");
            System.out.println("5. Check Available Seats");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    p1.displayTrainDetails();
                    break;
                case 2:
                    p1.bookTicket();
                    break;
                case 3:
                    p1.cancelTicket();
                    break;
                case 4:
                    p1.displayPassengerDetails();
                    break;
                case 5:
                    p1.checkAvailableSeats();
                    break;
                case 6:
                    System.out.println("Thank you for using Railway Reservation System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
        sc.close();
    }
}

//OUTPUT:
/*
===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 1

----- TRAIN DETAILS -----
Train Number: 12345
Train Name: Express Train
Source: Kolkata
Destination: Delhi
Available Seats: 50

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 2

Enter Passenger Name: Aditya Das
Enter Passenger Age: 20
Enter Number of Tickets: 5

Ticket Booked Successfully!
Passenger Name: Aditya Das
Tickets Booked: 5

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 4

----- PASSENGER DETAILS -----
Passenger Name: Aditya Das
Passenger Age: 20
Train Number: 12345
Train Name: Express Train
Number of Tickets: 5

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 5

Available Seats: 45

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 3
Ticket Cancelled Successfully!
Cancelled Tickets: 5

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 5

Available Seats: 50

===== RAILWAY RESERVATION SYSTEM =====
1. Display Train Details
2. Book Train Ticket
3. Cancel Train Ticket
4. Display Passenger Details
5. Check Available Seats
6. Exit
Enter your choice: 6
Thank you for using Railway Reservation System!
*/