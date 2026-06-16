package day16;
import java.util.*;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,1,2,3,4,2,3,4,5,6,7,9,8,6,7,8,1,2,1,2,1,1,1,4,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        list.toArray();
        ArrayList<Integer>  list1 = new ArrayList<>();
        for(int i =0;i<list.size();i++){
            if(!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }                                
        }
        int maxfreq = 0;
        int num =0;
        for(int i=0;i<list1.size();i++){
            int freq = Collections.frequency(list,list1.get(i));
            if(freq>maxfreq){
                maxfreq = freq;
                num =list1.get(i);
            }
        }
        System.out.println("maximum frequency of num is"+ num +" "+maxfreq);
        sc.close();
    }   
}
