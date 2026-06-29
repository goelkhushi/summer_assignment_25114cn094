package day29;
import java.util.*;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int num1,num2;
        do{
            System.out.println("MENU DRIVEN CALCULATOR🧮");
            System.out.println("1: ADDITION");
            System.out.println("2:SUBTRACTION");
            System.out.println("3:DIVISION");
            System.out.println("4:MULTIPLICATION");
            System.out.println("ENTER CHOICE");
            ch=sc.nextInt();
            System.out.println("ENTER THE FIRST NUMBER");
            num1 = sc.nextInt();
            System.out.println("ENTER THE SECOND NUMBER");
            num2 = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("ADDITION OF TWO NUMBERS IS"+(num1+num2));
                    break;
                case 2:
                    System.out.println("SUBTRACTION OF TWO NUMBERS IS"+(num1-num2));
                    break;
                case 3:
                    System.out.println("DIVISION OF TWO NUMBERS IS"+(num1/num2));
                    break;
                case 4:
                    System.out.println("MULTIPLICATION OF TWO NUMBERS IS"+(num1*num2));
                    break;                
            }
        }
        while(ch!=0);
        System.out.println("THANKS FOR CHOOSING MENU DRIVEN CALCULATOR❤️");
        sc.close();
    }
}
