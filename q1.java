package day13;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }    
}
