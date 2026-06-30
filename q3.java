package day30;
import java.util.*;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max=100;
        int[] empId = new int[max];
        String[] empName = new String[max];
        String[] department = new String[max];
        String[] designation = new String[max];
        double[] salary = new double[max];

        int count = 0;
        int choice;

        do {

            System.out.println("\n========== MINI EMPLOYEE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Calculate Annual Salary");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count == max) {
                        System.out.println("Employee List is Full!");
                        break;
                    }

                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Department: ");
                    department[count] = sc.nextLine();

                    System.out.print("Enter Designation: ");
                    designation[count] = sc.nextLine();

                    System.out.print("Enter Monthly Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Employee Records Found.");
                    } else {

                        System.out.println("\n========== EMPLOYEE DETAILS ==========");

                        for (int i = 0; i < count; i++) {

                            System.out.println("\nEmployee " + (i + 1));
                            System.out.println("ID          : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Department  : " + department[i]);
                            System.out.println("Designation : " + designation[i]);
                            System.out.println("Salary      : " + salary[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (empId[i] == searchId) {

                            System.out.println("\nEmployee Found");
                            System.out.println("ID          : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Department  : " + department[i]);
                            System.out.println("Designation : " + designation[i]);
                            System.out.println("Salary      : " + salary[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {

                        if (empId[i] == updateId) {

                            System.out.print("Enter New Name: ");
                            empName[i] = sc.nextLine();

                            System.out.print("Enter New Department: ");
                            department[i] = sc.nextLine();

                            System.out.print("Enter New Designation: ");
                            designation[i] = sc.nextLine();

                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();

                            System.out.println("Employee Updated Successfully!");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {

                        if (empId[i] == deleteId) {

                            for (int j = i; j < count - 1; j++) {

                                empId[j] = empId[j + 1];
                                empName[j] = empName[j + 1];
                                department[j] = department[j + 1];
                                designation[j] = designation[j + 1];
                                salary[j] = salary[j + 1];
                            }

                            count--;

                            System.out.println("Employee Deleted Successfully!");

                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 6:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    boolean salaryFound = false;

                    for (int i = 0; i < count; i++) {

                        if (empId[i] == id) {

                            double annualSalary = salary[i] * 12;

                            System.out.println("Employee Name : " + empName[i]);
                            System.out.println("Monthly Salary: " + salary[i]);
                            System.out.println("Annual Salary : " + annualSalary);

                            salaryFound = true;
                            break;
                        }
                    }

                    if (!salaryFound) {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 7:

                    System.out.println("THANK YOU FOR CHOSSING MINI EMPLOYEE MAANGEMNT SYSYTEM❤️");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 7);

        sc.close();
    }
}
        
