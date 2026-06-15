package day15;
import java.util.*;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("enter a size of an aray");
        int n = sc.nextInt();
        for(int i= 0;i<n;i++){
            int num = sc.nextInt();
            al.add(num);
        }
        System.out.println("before rotating an array left is"+al);
        for(int i=0;i<n-1;i++){
            int k = al.get(0);
            for (int j=1;j<n;j++){
                al.set(j-1,al.get(j));
            }
            al.set(n-1,k);
        }
        System.out.println("after rotating an array left is"+al);
        sc.close();
    }    
}
