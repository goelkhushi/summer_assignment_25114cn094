package day20;
import java.util.*;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner("System.in");
        System.out.println("enter a row of an array is");
        int n1 = sc.nextInt();
        System.out.println("enter a cloumn of an array is");
        int r1 = sc.nextInt();
        int arr[][] = new int[n1][r1];
        int sum =0;
        for(int i= 0;i<n1;i++){
            for( int j =0;j<r1;j++){
                int num = sc.nextInt();
                arr[n1][r1] = num;
            }
        }
        for(int i=1;i<=n1;i++){
            sum =0;
            for(int j=1;j<=r1;j++){
                sum = sum + arr[n1][r1];
            }
            System.out.println("sum of  i row of an array is" +i+" " +sum);
        }
        sc.close();        
    }    
}

