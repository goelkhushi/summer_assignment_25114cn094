package day11;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int max = maxoftwonumbers(n1,n2);
        System.out.println("max of two numbers is"+max);
        sc.close();
    }
    public static int maxoftwonumbers(int n1,int n2){
        if(n1>n2)
            return n1;
        return n2;
    }
        
}
