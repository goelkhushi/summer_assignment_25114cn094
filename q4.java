package day27;
import java.util.*;

class Student {

    int rollNo;
    String name;
    int english;
    int maths;
    int science;
    int computer;
    int hindi;

    Student(int rollNo, String name, int english, int maths, int science, int computer, int hindi) {
        this.rollNo = rollNo;
        this.name = name;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.computer = computer;
        this.hindi = hindi;
    }

    int total() {
        return english + maths + science + computer + hindi;
    }

    double percentage() {
        return total() / 5.0;
    }

    String grade() {
        double per = percentage();

        if (per >= 90)
            return "A+";
        else if (per >= 80)
            return "A";
        else if (per >= 70)
            return "B";
        else if (per >= 60)
            return "C";
        else if (per >= 50)
            return "D";
        else
            return "F";
    }

    String result() {
        if (english >= 33 && maths >= 33 && science >= 33 && computer >= 33 && hindi >= 33)
            return "PASS";
        else
            return "FAIL";
    }

    void display() {
        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("--------------------------------");
        System.out.println("English     : " + english);
        System.out.println("Maths       : " + maths);
        System.out.println("Science     : " + science);
        System.out.println("Computer    : " + computer);
        System.out.println("Hindi       : " + hindi);
        System.out.println("--------------------------------");
        System.out.println("Total       : " + total() + "/500");
        System.out.println("Percentage  : " + percentage() + "%");
        System.out.println("Grade       : " + grade());
        System.out.println("Result      : " + result());
    }
}

public class q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n====== MARKSHEET GENERATION SYSTEM ======");
            System.out.println("1. Add Student");
            System.out.println("2. View All Marksheets");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;

                    for (Student s : students) {
                        if (s.rollNo == roll) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Roll Number Already Exists.");
                        break;
                    }

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("English Marks: ");
                    int english = sc.nextInt();

                    System.out.print("Maths Marks: ");
                    int maths = sc.nextInt();

                    System.out.print("Science Marks: ");
                    int science = sc.nextInt();

                    System.out.print("Computer Marks: ");
                    int computer = sc.nextInt();

                    System.out.print("Hindi Marks: ");
                    int hindi = sc.nextInt();

                    students.add(new Student(roll, name, english, maths, science, computer, hindi));

                    System.out.println("Student Added Successfully.");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Records Found.");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Roll Number: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {

                        if (s.rollNo == search) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Roll Number: ");
                    int update = sc.nextInt();

                    boolean updated = false;

                    for (Student s : students) {

                        if (s.rollNo == update) {

                            System.out.print("New English Marks: ");
                            s.english = sc.nextInt();

                            System.out.print("New Maths Marks: ");
                            s.maths = sc.nextInt();

                            System.out.print("New Science Marks: ");
                            s.science = sc.nextInt();

                            System.out.print("New Computer Marks: ");
                            s.computer = sc.nextInt();

                            System.out.print("New Hindi Marks: ");
                            s.hindi = sc.nextInt();

                            System.out.println("Marks Updated Successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Student Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Roll Number: ");
                    int delete = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).rollNo == delete) {
                            students.remove(i);
                            System.out.println("Record Deleted Successfully.");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Student Not Found.");

                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}


