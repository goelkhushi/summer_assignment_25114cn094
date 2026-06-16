package day16;
import java.util.*;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,4,5,3,6,8,10,9};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        list.toArray();
        for(int i=1;i<=list.size();i++){
            if(list.contains(i)){
                System.out.print(" ");
            }
            else
                System.out.print(i);
        }  
        sc.close();              
    }    
}
