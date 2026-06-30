package day30;
import java.util.*;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        int count =0;
        int max =100;
        String[] book_id = new String[max];
        String[] author = new String[max];
        String[] bookname = new String[max];
        String[] status = new String[max];
        do{
            System.out.println(" MINI LIBRARY RECORD MANAGEMENT");
            System.out.println("1:ADD BOOK");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:

                    if (count == max) {
                        System.out.println("Library is Full!");
                        break;
                    }

                    System.out.print("Enter Book ID: ");
                    book_id[count] = sc.nextLine();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookname[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author[count] = sc.nextLine();
                    status[count] = "Available";
                    count++;
                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available.");
                    } else {
                        System.out.println("\n------ BOOK LIST ------");

                        for (int i = 0; i < count; i++) {

                            System.out.println("Book " + (i + 1));
                            System.out.println("Book ID : " + book_id[i]);
                            System.out.println("Book Name : " + bookname[i]);
                            System.out.println("Author : " + author[i]);
                            System.out.println("Status : " + status[i]);
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Book ID to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (book_id[i] == search) {

                            System.out.println("Book Found!");
                            System.out.println("Book ID : " + book_id[i]);
                            System.out.println("Book Name : " + bookname[i]);
                            System.out.println("Author : " + author[i]);
                            System.out.println("Status : " + status[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to Issue: ");
                    String issue = sc.nextLine();

                    boolean issued = false;

                    for (int i = 0; i < count; i++) {

                        if (book_id[i] == issue) {

                            if (status[i].equals("Available")) {
                                status[i] = "Issued";
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book Already Issued.");
                            }

                            issued = true;
                            break;
                        }
                    }

                    if (!issued) {
                        System.out.println("Book Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Book ID to Return: ");
                    String ret = sc.nextLine();

                    boolean returned = false;

                    for (int i = 0; i < count; i++) {

                        if (book_id[i] == ret) {

                            if (status[i].equals("Issued")) {
                                status[i] = "Available";
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book is Already Available.");
                            }

                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("Book Not Found.");
                    }

                    break;

                case 6:
                    System.out.println("Thank You for Using Library System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } 
        while (ch != 6);
        System.out.println("THANKS FOR CHOOSING MINI LIBRARAY MANAGEMENT SYSTEM");
        sc.close();
    }

}
    

