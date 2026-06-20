package day19;
import java.util.*;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row of an array is");
        int n1 = sc.nextInt();
        System.out.println("enter a column of an array is");
        int r1 = sc.nextInt();
        int arr1[][] = new int[n1][r1];
        int sum =0;
        for(int i =0;i<n1;i++){
            for(int j=0;j<r1;j++){
                int num = sc.nextInt();
                arr1[i][j] = num;
            }
        }
        if(n1 == r1){
            for(int i=0;i<n1;i++){
                sum = sum +arr1[i][i];
            }
        }
        System.out.println("sum of diognal elements of an array is"+sum);
        sc.close();        
    }    
}

