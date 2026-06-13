package day13;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n = sc.nextInt();
        int arr[] =new int[n];
        for (int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
        int max =arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] >max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("maximum number of an array is"+max);
        System.out.println( "minimum number of an array is"+min);
        sc.close();
    }    
}
