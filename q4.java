package day_7;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int sum =0;
        int r =0;
        int rev = reverse(num,r,sum);
        System.out.println("reverse of anumber is"+rev);
        sc.close();
    }
    public static int reverse(int num,int r,int sum){
        if (num == 0)
            return sum;
        r = num%10;
        sum = sum*10 +r;
        return reverse(num/10,r,sum);
    }      
}
