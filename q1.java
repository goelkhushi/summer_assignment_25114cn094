package day11;

import java.util.Scanner;

public class q1 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 = sc.nextInt();
        int sum = sumofnumbers(n1,n2);
        System.out.println("sum of two numbers "+sum);
        sc.close();
    }
    public static int sumofnumbers(int n1,int n2){
        return n1+n2;
    }       
}
    

