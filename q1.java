package day27;
import java.util.*;

    class student{
        int rollno;
        String name;
        String section;
        String course;
        int marks;
        int age;
        student(int rollno,String name,String section,String course,int marks,int age){
            this.rollno = rollno;
            this.name = name;
            this.section = section;
            this.course =course;
            this.marks = marks;
            this.age = age;
        }
        void getGrade(){
            if(marks>90){
                System.out.println("Grade is A");
            }
            else if(marks>70&&marks<90){
                System.out.println("Grade is B");
            }
            else{
                System.out.println("Grade is C");
            }
        }
        void Display(){
            System.out.println("1: ROLL NO."+rollno);
            System.out.println("2:NAME"+name);
            System.out.println("3:SECTION"+section);
            System.out.println("4:COURSE"+course);
            System.out.println("5:AGE"+age);
        }
    }
    public class q1{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            ArrayList<student>student =new ArrayList<>();
            int ch;
            do{
                System.out.println("////STUDENT RECORD MANAGEMENT///");
                System.out.println("1:ADD RECORD");
                System.out.println("2:VIEW RECORD");
                System.out.println("3: UPDATE REORD");
                System.out.println("4:DELETE RECORD");
                System.out.println("ENTER CHOICE");
                ch = sc.nextInt();
                switch(ch){
                    case 1:
                        System.out.println("ENTER A ROLL NUMBER");
                        int rollno = sc.nextInt();
                        int p=0;
                        for(student s :student){
                            if(s.rollno == rollno){
                                System.out.println("ROLL NUMBER ALREADY EXIST");
                                p=1;
                                break;
                            }
                        }
                        if(p==0){
                            System.out.println("ENTER NAME");
                            String name = new String();
                            name = sc.nextLine();
                            System.out.println("ENTER SECTION");
                            String section = new String();
                            section = sc.nextLine();
                            System.out.println("ENTER COURSE");
                            String course = new String();
                            course = sc.nextLine();
                            System.out.println("ENTER MARKS");
                            int marks = sc.nextInt();
                            System.out.println("ENTER AGE");
                            int age = sc.nextInt();
                            student.add(new student(rollno,name,section,course,marks,age));            
                        }
                        break;
                    case 2:
                        System.out.println("DISPLAY STUDENT RECORD MANAGEMENT");
                        System.out.println("ENTER YOUR ROLL NUMBER");
                        rollno =sc.nextInt();
                        p=0;
                        for(student s:student){
                            if(s.rollno == rollno){
                                p=1;
                                break;
                            }
                        }
                        if(p==1){
                            for(student s:student){
                                s.Display();
                            }
                        }
                        else{
                            System.out.println("ROLL NUMBWR IS NOT FOUND");
                        }
                        break;
                    case 3:
                        System.out.println("UPDATE STUDENT RECORD MANAGEMENT");
                        System.out.println("ENTER YOUR ROLL NUMBER WHICH YOU UPDATE");
                        rollno =sc.nextInt();
                        p=0;
                        for(student s:student){
                            if(s.rollno == rollno){
                                System.out.println("ENTER A NEW ROLL NUMBER");
                                s.rollno = sc.nextInt();
                                System.out.println("ENTER a NEW NAME");
                                s.name = sc.nextLine();
                                System.out.println("ENTER A NEW SECTION");
                                s.section = sc.nextLine();
                                System.out.println("ENTER A NEW COURSE");
                                s.course = sc.nextLine();
                                System.out.println("ENTER A NEW MARKS");
                                s.marks = sc.nextInt();
                                System.out.println("ENTER A NEW AGE");
                                s.age = sc.nextInt();
                                p=1;
                            }
                        }
                        if(p==0){
                            System.out.println("ROLL NUMBER IS NOT FOUND");
                        }
                        break;
                    case 4:
                        System.out.println("DELETE STUDENT RECORD MANGEMENT");
                        System.out.println("ENTER YOUR ROLL NUMBER WHICH YOU DELETE");
                        int deleterollno = sc.nextInt();
                        p=0;
                        for (int i = 0; i < student.size(); i++) {
                            if (student.get(i).rollno == deleterollno) {
                                student.remove(i);   
                                System.out.println("Student Record Deleted Successfully");
                                p=1;
                                break;
                            }
                        }
                        if(p==0){
                            System.out.println("ROLL NUMBER IS NOT FOUND");
                        }
                        break;
                    default:
                        System.out.println("THANK YOU FOR USING STUDENT RECORD MANGEMENT❤️");
                }
            } 
            while (ch != 0);
            System.out.println("PROGRAM IS FINISHED😉");
            sc.close();
        }
    }

    


    
    

