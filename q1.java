package day_7;
import java.util.Scanner;

public class q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System .out.println("enter a number num is");
        int num = sc.nextInt();
        int ans = factorial(num);
        System.out.println("factorial of a number is"+ans);
        sc.close();
    }
    public static int factorial(int num){
        if (num ==0||num == 1){
            return 1;
        }
        return num*factorial(num-1);
    }       
}
