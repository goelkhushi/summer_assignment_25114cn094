package day_7;
import java.util.Scanner;

public class q2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum =0;
        int fibo = fiobonacci(a,b,sum,n);
        System.out.println("fibonacci of nth term is"+fibo);
        sc.close();
    }
    public static  int fiobonacci(int a,int b,int sum,int n){
        if (n==1||n==2)
            return b;
        sum = a+b;
        a =b;
        b=sum;
        return (fiobonacci(a,b,sum,n-1));
    }    
}
