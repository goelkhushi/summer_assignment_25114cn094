package day25;

import java.util.*;

public class q3 {
    public static void maoin(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of an list");
        int n1 = sc.nextInt();
        String s = new String();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n1;i++){
            s = sc.nextLine();
            list.add(s);            
        }
        Collections.sort(list);
        sc.close();
    }    
}

    

    

