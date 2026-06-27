package day27;
import java.util.*;
class Employee{
        int employee_id;
        String name;
        String department;
        String designation;
        int salary;
        Employee(int employee_id,String name,String department,String designation,int salary){
            this.employee_id = employee_id;
            this.name = name;
            this.department = department;
            this.designation =designation;
            this.salary = salary;
        }
        int Salary(){
            return salary*12;
        }
        void Display(){
            System.out.println("1: EMPLOYEE ID."+employee_id);
            System.out.println("2:NAME"+name);
            System.out.println("3:DEPARTMENT"+department);
            System.out.println("4:DESIGNATION"+designation);
            System.out.println("5:Slaray"+Salary());
        }
    }
public class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee>employee =new ArrayList<>();
        int ch = 0;
        int emp_id = 0;
        int p = 0;
        do{
            System.out.println("////EMPLOYEE RECORD MANAGEMENT///");
            System.out.println("1:ADD RECORD");
            System.out.println("2:VIEW RECORD");
            System.out.println("3: UPDATE REORD");
            System.out.println("4:DELETE RECORD");
            System.out.println("ENTER CHOICE");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("ENTER A EMPLOYEE ID");
                    emp_id = sc.nextInt();
                    p = 0;
                    for(Employee e :employee){
                        if(e.employee_id == emp_id){
                            System.out.println(" EMPLOYEE ID ALREADY EXIST");
                            p=1;
                            break;
                        }
                    }
                    if(p==0){
                            sc.nextLine();
                            System.out.println("ENTER NAME");
                            String name = sc.nextLine();
                            System.out.println("ENTER DEPARTMENT");
                            String department = sc.nextLine();
                            System.out.println("ENTER DESIGNATION");
                            String designation = sc.nextLine();
                            System.out.println("ENTER SALARY");
                            int salary = sc.nextInt();
                            employee.add(new Employee(emp_id,  name,  department,  designation,  salary)) ;
                            System.out.println("RECORD IN SALRY MAANGEMNET ADD SUCCESFULLY");          
                    }
                    break;
                case 2:
                    System.out.println("DISPLAY EMPLOYEE RECORD MANAGEMENT");
                    System.out.println("ENTER YOUR EMPLOYEE ID");
                    emp_id = sc.nextInt();
                    p = 0;
                    for(Employee e:employee){
                        if(e.employee_id == emp_id){
                            p=1;
                            break;
                        }
                    }
                    if(p==1){
                        for(Employee e:employee){
                            e.Display();
                        }
                    }
                    else{
                        System.out.println("EMPLOYEE  ID IS NOT FOUND");
                    }
                    break;
                case 3:
                    System.out.println("UPDATE SALRAY RECORD MANAGEMENT");
                    System.out.println("ENTER YOUR EMPLOYEE IDWHICH YOU UPDATE");
                    emp_id = sc.nextInt();
                    p = 0;
                    for(Employee e:employee){
                        if(e.employee_id == emp_id){
                            System.out.println("ENTER A NEW EMPLYEE ID");
                            e.employee_id = sc.nextInt();
                            sc.nextLine();
                            System.out.println("ENTER a NEW NAME");
                            e.name = sc.nextLine();
                            System.out.println("ENTER A NEW DEPARTMAENT");
                            e.department = sc.nextLine();
                            System.out.println("ENTER A NEW DESIGNATION");
                            e.designation = sc.nextLine();
                            System.out.println("ENTER A NEW SALARY");
                            e.salary = sc.nextInt();
                            p=1;
                        }
                    }
                    if(p==0){
                        System.out.println("EMPLOYEE ID IS NOT FOUND");
                    }
                    break;
                case 4:
                    System.out.println("DELETE EMPLOYEE RECORD MANGEMENT");
                    System.out.println("ENTER YOUR EMPLOYEE ID WHICH YOU DELETE");
                    int deleteempid = sc.nextInt();
                    p = 0;
                    for (int i = 0; i < employee.size(); i++) {
                        if (employee.get(i).employee_id == deleteempid) {
                            employee.remove(i);   
                            System.out.println("EMPLOYEE Record Deleted Successfully");
                            p=1;
                            break;
                        }
                    }
                    if(p==0){
                        System.out.println("EMPLOYEE ID IS NOT FOUND");
                    }
                    break;
                default:
                    System.out.println("THANK YOU FOR USING EMPLOYEE  RECORD MANGEMENT❤️");
            }
        } while(ch!=0);
        System.out.println("PROGRAM IS FINISHED😉");
        sc.close();
    }
}
