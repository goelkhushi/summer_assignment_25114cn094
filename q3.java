package day12;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b =1;
        int sum =0;
        System.out.println("enter a number of ters of fibonacci series");
        int n= sc.nextInt();
        int fibo = fibonacci(a,b,sum,n);
        System.out.println(fibo+" ");
        sc.close();
    }
    public static int fibonacci(int a ,int b,int sum,int n){
        if (n==0)
            return sum;
        sum = a+b;
        a =b;
        b=sum;
        return fibonacci(a,b,sum,n-1);
    }    
}
