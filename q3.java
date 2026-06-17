package day17;
import java.util.*;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of first arrray n1 is");
        int n1 = sc.nextInt();
        System.out.println("enter a size of second array n1 is ");
        int n2 = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n1);
        for(int i =0;i<n1;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        ArrayList<Integer> list1 = new ArrayList<>(n2);
        for(int i =0;i<n2;i++){
            int num = sc.nextInt();
            list1.add(num);
        }
        list.toArray();
        list1.toArray();
        int nf = n1+n2;
        ArrayList<Integer> list3 = new ArrayList<>(nf);
        if(n1 ==n2){
            int min1 =0;
            int min2 = 0;
            while(list.size() != 0 ){
                min1 = Collections.min(list);
                min2 = Collections.min(list1);
                if(!list3.contains(min1)&& !list3.contains(min2)){
                    if(min1<min2){
                        list.remove(Integer.valueOf(min1));
                    }
                    else if(min1>min2){
                        list.remove(Integer.valueOf(min2));
                    }
                    else{
                        list3.add(min1);
                        list.remove(Integer.valueOf(min1));
                        list1.remove(Integer.valueOf(min2));
                    }
                }
                else{
                    list.remove(Integer.valueOf(min1));
                    list1.remove(Integer.valueOf(min2));

                }                
            }
            System.out.print(list3);
            sc.close();
        }
    }    
}

    

