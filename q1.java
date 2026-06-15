package day15;
import java.util.*;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            al.add(i);
        }
        System.out.println("before reverse an array"+al);
        int p=0;
        for(int i=n-1;i>=0;i--){
            al.set(p,i);
            p++;
        }
        System.out.println("after reverse an array is "+al);
        sc.close();            
    }    
}
