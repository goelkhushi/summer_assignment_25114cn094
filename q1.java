package day12;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 =pallindrome(num);
        if (num == num1){
            System.out.println("it is a pallindrome number");
        }
        else
            System.out.println("it is not a pallindrome number");
        sc.close();
    }
    public static int pallindrome(int num){
        int r;
        int sum =0;
        while(num!=0){
            r = num%10;
            sum = sum%10*r;
            num =num/10;
        }
        return sum;
    }    
}
