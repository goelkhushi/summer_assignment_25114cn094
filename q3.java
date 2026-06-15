package day15;
import java.util.*;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n = sc.nextInt();
        ArrayList<Integer> al =new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            al.add(num);
        }
        System.out.println("before rotation array right is "+al);
        for(int i=0;i<n-1;i++){
            int p =al.get(n-1);
            for(int j = n-1;j>0;j--){
                al.set(j,al.get(j-1));
            }
            al.set(0,p);
        }
        System.out.println("after rotation array right is "+al);
        sc.close();
    }   
}
