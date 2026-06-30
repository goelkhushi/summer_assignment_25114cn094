package day30;
import java.util.*;

public class q4 {
    static Scanner sc = new Scanner(System.in);

    static int MAX = 100;
    static int count = 0;

    static int[] empId = new int[MAX];
    static String[] empName = new String[MAX];
    static String[] department = new String[MAX];
    static String[] designation = new String[MAX];
    static double[] salary = new double[MAX];
    static void addEmployee() {

        System.out.print("Enter Employee ID : ");
        empId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        empName[count] = sc.nextLine();

        System.out.print("Enter Department : ");
        department[count] = sc.nextLine();

        System.out.print("Enter Designation : ");
        designation[count] = sc.nextLine();

        System.out.print("Enter Monthly Salary : ");
        salary[count] = sc.nextDouble();

        count++;

        System.out.println("Employee Added Successfully.");
    }

    static void displayEmployee() {

        if (count == 0) {
            System.out.println("No Employee Record Found.");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("ID          : " + empId[i]);
            System.out.println("Name        : " + empName[i]);
            System.out.println("Department  : " + department[i]);
            System.out.println("Designation : " + designation[i]);
            System.out.println("Salary      : " + salary[i]);
        }
    }

    static void searchEmployee() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.println("Employee Found");
                System.out.println("Name : " + empName[i]);
                System.out.println("Department : " + department[i]);
                System.out.println("Designation : " + designation[i]);
                System.out.println("Salary : " + salary[i]);
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    static void updateEmployee() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.print("New Name : ");
                empName[i] = sc.nextLine();

                System.out.print("New Department : ");
                department[i] = sc.nextLine();

                System.out.print("New Designation : ");
                designation[i] = sc.nextLine();

                System.out.print("New Salary : ");
                salary[i] = sc.nextDouble();

                System.out.println("Employee Updated.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    static void deleteEmployee() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                for (int j = i; j < count - 1; j++) {

                    empId[j] = empId[j + 1];
                    empName[j] = empName[j + 1];
                    department[j] = department[j + 1];
                    designation[j] = designation[j + 1];
                    salary[j] = salary[j + 1];
                }

                count--;

                System.out.println("Employee Deleted.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    static void calculateSalary() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.println("Employee : " + empName[i]);
                System.out.println("Monthly Salary : " + salary[i]);
                System.out.println("Annual Salary : " + (salary[i] * 12));
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    static void countEmployee() {

        System.out.println("Total Employees : " + count);
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Calculate Annual Salary");
            System.out.println("7. Count Employees");
            System.out.println("8. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployee();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 6:
                    calculateSalary();
                    break;

                case 7:
                    countEmployee();
                    break;

                case 8:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 8);
    }
}

