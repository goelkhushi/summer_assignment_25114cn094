package day19;
import  java.util.*;
public class q3 {
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
        System.out.println("before tranpose of an array is");
        for(int i= 1;i<=n1;i++){
            for(int j=1;j<=r1;j++){
                System.out.print(+arr1[i][j]);
            }
            System.out.println();
        }
        for(int k=1;k<=r1;k++){
            for( int j=1;j<=n1;j++){
                num1 = arr1[j][k];
                arr2[k][j] =num1;                                                        
            }
        }
        System.out.println("after  tranpose of an array is");
        for(int k=1;k<=r1;k++){
            for( int j=1;j<=n1;j++){
                System.out.print(+arr2[k][j]);                                                       
            }
            System.out.println();
        }
        sc.close();
    }    
}

