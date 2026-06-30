package day30;
import java.util.*;
public class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int MAX =100;
        int [] roll = new int[MAX];
        String[] name = new String[MAX];
        String[] section = new String[MAX];
        String[] course = new String[MAX];
        int ch;
        int count =0;
        do{
            System.out.println("STUDENT MANGEMENT SYSTEM USING ARRAYS AND STRINGS");
            System.out.println("1:ADD STUDENT");
            System.out.println("2:DISPLAY STUDENT");
            System.out.println("3:DELETE STUDENT");
            System.out.println("4:UPDATE STUDENT");
            System.out.println("ENTER CHOICE");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    if(count == MAX){
                        System.out.println("STUDENT RECORD IS FULL");
                        break;
                    }                   
                    System.out.println("ENTER A ROLL NUMBER");
                    roll[count] =sc.nextInt();
                    System.out.println("ENTER NAME OF STUDENT");
                    name[count] =sc.nextLine();
                    System.out.println("ENTER SECTION");
                    section[count] =sc.nextLine();
                    System.out.println("ENTER COURSE");
                    course[count] =sc.nextLine();
                    count++;
                case 2:
                    if(count ==0){
                        System.out.println("RECORD IS NOT FOUND");
                    }
                    else{
                        for (int i = 0; i < count; i++) {
                            System.out.println("Student " + (i + 1));
                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Course      : " + course[i]);
                            System.out.println("----------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("ENTER A ROLL NUMBER YOU WANT TO DELETE");
                    int deleteroll =sc.nextInt();
                    int p=0;
                    if(count ==0){
                        System.out.println("RECORD IS NOT FOUND");
                    }
                    else{
                        for (int i = 0; i < count; i++) {

                        if (roll[i] == deleteroll) {

                            for (int j = i; j < count - 1; j++) {

                                roll[j] = roll[j + 1];
                                name[j] = name[j + 1];
                                course[j] = course[j + 1];
                            }
                            count--;
                            p=1;
                            break;
                        }
                        }
                    }
                    if(p==0){
                        System.out.println("ROLL NUMBER IS NOT FOUND");
                    }
                    break;
                case 4:
                    if (count == 0) {
                        System.out.println("No Student Record Found.");
                        break;
                    }

                    System.out.print("Enter Roll Number to Update: ");
                    int updateRoll = sc.nextInt();

                    sc.nextLine();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == updateRoll) {

                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Course: ");
                            course[i] = sc.nextLine();

                            System.out.println("Record Updated Successfully!");

                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student Not Found.");
                    }

                    break;


            }
            
        }
        while(ch!=0);
        System.out.println("THANK YOU FOR CHOSSING STUDENT RECORD❤️");
        sc.close();
    }
}
