package day20;
import java.util.*;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row of first array is");
        int n1 = sc.nextInt();
        System.out.println("enter a cloumn of first array is");
        int r1 = sc.nextInt();
        int arr1[][] = new int[n1][r1];
        System.out.println("enter a row of second array is");
        int n2 = sc.nextInt();
        System.out.println("enter a column of second array is");
        int r2 = sc.nextInt();
        int arr2[][] = new int[n2][r2];
        int arr3[][] = new int[n1][r2];
        int multi =0;
        for(int i= 0;i<n1;i++){
            for(int j=0;j<r1;j++){
                int num = sc.nextInt();
                arr1[i][j] = num;
            }
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<r1;j++){
                int num = sc.nextInt();
                arr2[i][j] = num;
            }
        }
        if(r1 == n2){
            for(int i =1;i<n1;i++){
                for(int j=1;j<r2;j++){
                    for(int k =1;k<r1;k++){
                        multi = arr1[i][k] * arr2[k][i];
                        arr3[i][j] = multi;                       
                    }
                }
            }
        }
        System.out.println("after multipy the two matrix is");
        for(int i=0;i<n1;i++){
            for(int j=0;j<r2;j++){
                System.out.print(+arr3[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }   
}

