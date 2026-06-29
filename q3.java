package day28;
import java.util.*;

class Ticket {

    int ticketId;
    String passengerName;
    String source;
    String destination;
    String travelDate;
    double fare;

    Ticket(int ticketId, String passengerName, String source,
           String destination, String travelDate, double fare) {

        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.travelDate = travelDate;
        this.fare = fare;
    }

    void display() {

        System.out.println("---------------------------------------");
        System.out.println("Ticket ID      : " + ticketId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Source         : " + source);
        System.out.println("Destination    : " + destination);
        System.out.println("Travel Date    : " + travelDate);
        System.out.println("Fare           : ₹" + fare);
    }
}

public class q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n========== TICKET BOOKING SYSTEM ==========");
            System.out.println("1. Book Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Update Ticket");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;

                    for (Ticket t : tickets) {
                        if (t.ticketId == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Ticket ID Already Exists.");
                        break;
                    }

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Source: ");
                    String source = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    String destination = sc.nextLine();

                    System.out.print("Enter Travel Date (DD/MM/YYYY): ");
                    String date = sc.nextLine();

                    System.out.print("Enter Fare: ");
                    double fare = sc.nextDouble();

                    tickets.add(new Ticket(id, name, source, destination, date, fare));

                    System.out.println("Ticket Booked Successfully.");
                    break;

                case 2:

                    if (tickets.isEmpty()) {
                        System.out.println("No Tickets Booked.");
                    } else {
                        for (Ticket t : tickets) {
                            t.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Ticket ID: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (Ticket t : tickets) {

                        if (t.ticketId == search) {
                            t.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Ticket Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Ticket ID to Update: ");
                    int update = sc.nextInt();
                    sc.nextLine();

                    boolean updated = false;

                    for (Ticket t : tickets) {

                        if (t.ticketId == update) {

                            System.out.print("Enter New Passenger Name: ");
                            t.passengerName = sc.nextLine();

                            System.out.print("Enter New Source: ");
                            t.source = sc.nextLine();

                            System.out.print("Enter New Destination: ");
                            t.destination = sc.nextLine();

                            System.out.print("Enter New Travel Date: ");
                            t.travelDate = sc.nextLine();

                            System.out.print("Enter New Fare: ");
                            t.fare = sc.nextDouble();

                            System.out.println("Ticket Updated Successfully.");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Ticket Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Ticket ID to Cancel: ");
                    int cancel = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < tickets.size(); i++) {

                        if (tickets.get(i).ticketId == cancel) {

                            tickets.remove(i);

                            System.out.println("Ticket Cancelled Successfully.");

                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Ticket Not Found.");

                    break;

                case 6:

                    System.out.println("Thank You for Using Ticket Booking System.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
