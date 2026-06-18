package day18;
import java.util.*;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(list.get(j)>list.get(j+1)){
                    int temp =list.get(j);
                    int a =list.get(j+1);
                    int b= temp;
                    list.set(j,a);
                    list.set(j+1,b);
                }
            }
        }
        System.out.println("after bubble sort of an array is"+list);
        sc.close();
    }    
}
