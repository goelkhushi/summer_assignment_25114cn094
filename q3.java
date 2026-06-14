package day14;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n =sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
        int max =arr[0];
        int smax =arr[0];
        for(int i=0;i<n;i++){
             if (arr[i]>max){
                smax = max;
                max =arr[i];
             }
             if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
             }
        }
        System.out.println("second largest of an array is"+smax);
        sc.close();
    }    
}
