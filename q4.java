package day20;
import java.util.*;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner("System.in");
        System.out.println("enter a row of an array is");
        int n1 = sc.nextInt();
        System.out.println("enter a column of an array is");
        int r1 = sc.nextInt();
        int arr[][] = new int[n1][r1];
        int sum =0;
        for(int i=1;i<n1;i++){
            for(int j=1;j<r1;j++){
                int num = sc.nextInt();
                arr[n1][r1] = num;
            }
        }
        for(int j=1;j<=r1;j++){
            sum =0;
            for(int i=1;i<=n1;i++){
                sum = sum+arr[i][j];
            }
            System.out.println("sum of column j of an array is"+j+" "+sum);
        }
        sc.close();    
    }    
}

