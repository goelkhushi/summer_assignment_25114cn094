package day18;
import java.util.*;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array is");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        int min =0;
        int temp=0;
        int k =0;
        for(int i=0;i<n-1;i++){
            min =list.get(i);
            int p= list.get(i);
            for(int j=i+1;j<n;j++){
                if(list.get(j)<min){
                    min = list.get(j);
                    k =list.indexOf(min);

                }
            }
            temp =p;
            p =min;
            min =temp;
            list.set(i,p);
            list.set(k,min);
        }
        System.out.println("after selection sort of an array is"+list);
        sc.close();        
    }  
}
