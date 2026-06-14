package day14;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array ");
        int n = sc.nextInt();
        int arr[]  = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]+" ");
                    break;
                }                
            }
        }
        sc.close();
    }    
}
