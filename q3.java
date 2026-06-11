package day11;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int prime =primenumber(num);
         if(prime ==0){
            System.out.println("it is a prime number");
         }
         else
            System.out.println("it is not a prime number");
        sc.close();
    }
    public static int primenumber(int num){
        for(int i=2;i<num;i++){
            if (num%i==0){
                return 1;
            }
        }
        return 0;       
    }
          
}
