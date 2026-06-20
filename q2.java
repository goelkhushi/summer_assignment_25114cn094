package day20;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row of an array is");
        int n1 = sc.nextInt();
        System.out.println("enter a column of an array is");
        int r1 = sc.nextInt();
        int arr1[][] = new int[n1][r1];
        int arr2[][] = new int[r1][n1];
        int num1 =0;
        for(int i= 1;i<=n1;i++){
            for(int j=1;j<=r1;j++){
                int num = sc.nextInt();
                arr1[n1][r1] =num;
            }
        }
        for(int k=1;k<=r1;k++){
            for( int j=1;j<=n1;j++){
                num1 = arr1[j][k];
                arr2[k][j] =num1;                                                        
            }
        }
        if(arr1.equals(arr2)){
            System.out.println("symmetric matrix");
        }
        sc.close();
    }    
}

