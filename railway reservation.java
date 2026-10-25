
import java.util.Scanner;

class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String passengerName = "";
        int age = 0;
        int seats = 10;
        boolean booked = false;

        while (true) {
            System.out.println("\n===== RAILWAY RESERVATION SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Check Available Seats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (booked) {
                        System.out.println("Ticket already booked!");
                        break;
                    }

                    System.out.print("Enter passenger name: ");
                    passengerName = sc.nextLine();

                    System.out.print("Enter passenger age: ");
                    age = sc.nextInt();

                    if (seats > 0) {
                        seats--;
                        booked = true;
                        System.out.println("Ticket booked successfully!");
                    } else {
                        System.out.println("No seats available!");
                    }
                    break;

                case 2:
                    if (booked) {
                        System.out.println("\n--- Ticket Details ---");
                        System.out.println("Passenger Name: " + passengerName);
                        System.out.println("Passenger Age: " + age);
                        System.out.println("Seat Number: " + (10 - seats));
                    } else {
                        System.out.println("No ticket booked.");
                    }
                    break;

                case 3:
                    if (booked) {
                        seats++;
                        booked = false;
                        System.out.println("Ticket cancelled successfully!");
                    } else {
                        System.out.println("No ticket to cancel.");
                    }
                    break;

                case 4:
                    System.out.println("Available seats: " + seats);
                    break;

                case 5:
                    System.out.println("Thank you for using Railway Reservation!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}


output:
===== RAILWAY RESERVATION SYSTEM =====
1. Book Ticket
2. View Ticket
3. Cancel Ticket
4. Check Available Seats
5. Exit

Enter your choice: 1
Enter passenger name: Yuvaraj
Enter passenger age: 20
Ticket booked successfully!

Enter your choice: 2

--- Ticket Details ---
Passenger Name: Yuvaraj
Passenger Age: 20
Seat Number: 1