package day18;
import java.util.*;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array is");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int num  =sc.nextInt();
            list.add(num);
        }
        for(int i=0;i<n-1;i++){
            int max = list.get(i);
            int p= list.get(i);
            int maxind = i;
            for( int j =i+1;j<n;j++){
                if(list.get(j)>max){
                    max = list.get(j);
                    maxind =j;
                    
                }
            }
            list.set(i,max);
            list.set(maxind,p);
        }
        System.out.println("after arranging array in a desecending order is"+list);
        sc.close();        
    }    
}
