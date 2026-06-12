package day12;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a new number");
        int num =sc.nextInt();
        int num1 = armstrong(num);
        if (num == num1){
            System.out.println("it is an armstrong number");
        }
        else
            System.out.println("it is not an armstrong number");
        sc.close();
    }
    public static int armstrong(int num){
        int r ;
        int sum=0;
        while(num!=0){
            r = num%10;
            sum = sum+(r*r*r);
            num =num/10;
        }
        return sum;
    }    
}
