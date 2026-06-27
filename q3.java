package day27;
import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    double basicSalary;
    double hra;
    double da;
    double tax;

    Employee(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;

        // Salary Calculations
        hra = basicSalary * 0.20;   // 20%
        da = basicSalary * 0.10;    // 10%
        tax = basicSalary * 0.05;   // 5%
    }

    double grossSalary() {
        return basicSalary + hra + da;
    }

    double netSalary() {
        return grossSalary() - tax;
    }

    void display() {
        System.out.println("--------------------------------------");
        System.out.println("Employee ID   : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("Tax (5%)      : " + tax);
        System.out.println("Gross Salary  : " + grossSalary());
        System.out.println("Net Salary    : " + netSalary());
    }

    void updateSalary(double salary) {
        basicSalary = salary;
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        tax = basicSalary * 0.05;
    }
}

public class q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n========== SALARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;

                    for (Employee e : list) {
                        if (e.id == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Employee ID Already Exists!");
                        break;
                    }

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    list.add(new Employee(id, name, dept, salary));

                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:

                    if (list.isEmpty()) {
                        System.out.println("No Employee Records Found.");
                    } else {
                        for (Employee e : list) {
                            e.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (Employee e : list) {

                        if (e.id == search) {
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Employee ID: ");
                    int update = sc.nextInt();

                    boolean updated = false;

                    for (Employee e : list) {

                        if (e.id == update) {

                            System.out.print("Enter New Basic Salary: ");
                            double newSalary = sc.nextDouble();

                            e.updateSalary(newSalary);

                            System.out.println("Salary Updated Successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Employee ID: ");
                    int delete = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < list.size(); i++) {

                        if (list.get(i).id == delete) {

                            list.remove(i);

                            System.out.println("Employee Deleted Successfully.");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 6:

                    System.out.println("Thank You for Using Salary Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}

