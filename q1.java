package day19;
import java.util.*;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row of  first array is");
        int n1 = sc.nextInt();
        System.out.println("enter a column of first array is");
        int r1 = sc.nextInt();
        System.out.println("enter a row of second array is");
        int n2 = sc.nextInt();
        System.out.println("enter a column of second array is");
        int r2 = sc.nextInt();
        int arr1[][] = new int[n1][r1];
        int arr2[][] = new int[n2][r2];
        int sum =0;
        for(int i =0;i<n1;i++){
            for(int j= 0;j<r1;j++){
                int num = sc.nextInt();
                arr1[i][j] =num;
            }
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<r2;j++){
                int num = sc.nextInt();
                arr2[i][j] = num;
            }
        }
        if(n1 == n2 && r1 ==r2){
            for(int i =0;i<n1;i++){
                sum =0;
                for(int j= 0;j<r1;j++){
                    sum = arr1[i][j] +arr2[i][j];             
                }
                System.out.println(+sum);
            }
        }
        sc.close();                       
    }
    
}

