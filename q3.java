package day18;
import java.util.*;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array is");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i =0;i<n;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        int l =0;
        int n1 = n-1;
        int m =(l+n1)/2;
        System.out.println("enter a number you search");
        int  temp = sc.nextInt();
        list.toArray();
        if(list.get(m)<temp){
            for(int i=m;i<=n1;i++){
                if(temp == list.get(i)){
                    System.out.println(+temp);                   
                }

            }
        }
        else if(list.get(m)>temp){
            for(int i=0;i<m;i++){
                if(temp == list.get(i)){
                    System.out.println(+temp);
                }
            }
        }
        sc.close();
    }    
}
