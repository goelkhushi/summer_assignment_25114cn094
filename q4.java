package day28;

import java.util.ArrayList;
import java.util.Scanner;

class Contact {

    int id;
    String name;
    String phone;
    String email;
    String address;

    Contact(int id, String name, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    void display() {
        System.out.println("--------------------------------------");
        System.out.println("Contact ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Phone      : " + phone);
        System.out.println("Email      : " + email);
        System.out.println("Address    : " + address);
    }
}

public class q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n========== CONTACT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Contact ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;

                    for (Contact c : contacts) {
                        if (c.id == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Contact ID Already Exists.");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    contacts.add(new Contact(id, name, phone, email, address));

                    System.out.println("Contact Added Successfully.");
                    break;

                case 2:

                    if (contacts.isEmpty()) {
                        System.out.println("No Contacts Found.");
                    } else {
                        for (Contact c : contacts) {
                            c.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Contact ID: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (Contact c : contacts) {
                        if (c.id == search) {
                            c.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Contact Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Contact ID to Update: ");
                    int update = sc.nextInt();
                    sc.nextLine();

                    boolean updated = false;

                    for (Contact c : contacts) {

                        if (c.id == update) {

                            System.out.print("Enter New Name: ");
                            c.name = sc.nextLine();

                            System.out.print("Enter New Phone Number: ");
                            c.phone = sc.nextLine();

                            System.out.print("Enter New Email: ");
                            c.email = sc.nextLine();

                            System.out.print("Enter New Address: ");
                            c.address = sc.nextLine();

                            System.out.println("Contact Updated Successfully.");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Contact Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Contact ID to Delete: ");
                    int delete = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < contacts.size(); i++) {

                        if (contacts.get(i).id == delete) {

                            contacts.remove(i);

                            System.out.println("Contact Deleted Successfully.");

                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Contact Not Found.");

                    break;

                case 6:

                    System.out.println("Thank You for Using Contact Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
