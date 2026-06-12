package day12;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number num is");
        int num =sc.nextInt();
        int num1 = perfectnumber(num);
        if (num ==num1){
            System.out.println("it is a perfect number");
        }
        else
            System.out.println("it is not a perfect number");
        sc.close();
    }
    public static  int perfectnumber(int num){
        int r =0;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum =sum+r;
            }
        }
        return sum;
    }
    
}
