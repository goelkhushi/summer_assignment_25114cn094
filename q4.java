package day11;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number num is");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("factorial of a number num is"+num+" " +fact);
        sc.close();
    }
    public static int factorial(int num){
        int fact =1;
        for(int i=1;i<=num;i++){
            fact =fact*i;
        }
        return fact;
    }  
}
