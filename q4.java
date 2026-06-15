package day15;
import java.util.*;

public class q4 {
    public static void main(String[] args){
        int arr[] ={1,2,6,0,9,0,8,7,0,0,6,7,7,0,9};
        ArrayList<Integer> list  = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println("befor moving end to zeroes"+list);
        for(int i =0;i<list.size();i++){
            if (list.get(i) ==0){
                for(int j=i+1;j<list.size();j++){
                    list.set(j-1,list.get(j));
                }
                list.set(list.size()-1,0);
                i--;               
            }          
        }
        System.out.println("after moving end to zeroes is "+list);      
    }    
}
