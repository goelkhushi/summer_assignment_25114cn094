package day13;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] =sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        int avg = (sum/n);
        System.out.println(sum+" ");
        System.out.println(avg+" ");
        sc.close();
    }    
}
