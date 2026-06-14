package day14;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int count =0;
        for(int i=0;i<n-1;i++){
            for(int j =1;j<n;j++){
                if (arr[i] ==num){
                    count++;
                }
            System.out.println("frequency of num is"+arr[i]+" "+count);
            }
        }
        sc.close();
    }    
}
