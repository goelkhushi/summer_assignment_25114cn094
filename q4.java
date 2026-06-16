package day16;
import java.util.*; 

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,5,6,1,2,3,4,5,1,6,7,7,8,9,10};
        ArrayList<Integer> list =  new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add((arr[i]));                   
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }
        list.clear();
        for(int num:list1){
            list.add(num);
        }
        System.out.println("after removing duplictes elements in the list is"+list);
        sc.close();
    }   
}
