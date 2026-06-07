package day_7;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        int r =0;
        int ans =sumofdigits(num,sum,r);
        System.out.println("sum of digits of a number is"+ans);
        sc.close();
    }
    public static int sumofdigits(int num ,int sum,int r){
        if (num ==0)
            return sum;
        r = num%10;
        sum =sum+r;
        num = num/10;
        return sumofdigits( num,sum,r);
    }    
}
