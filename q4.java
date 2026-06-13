package day13;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter a number");
            arr [i] = sc.nextInt();
        }
        int counte =0;
        int counto =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                counte++;
            }
            else
                counto++;
        }
        System.out.println("count of even numbers in an array is"+counte);
        System.out.println("count of odd numbers of an array is"+counto);
        sc.close();
    }    
}
