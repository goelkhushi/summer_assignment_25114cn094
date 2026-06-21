package day_21;

import java.util.*;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.next();
        String rev ="";
        for(int i=s.length()-1;i>0;i--){
            rev+= s.charAt(i);
        }
        System.out.println("after reverse a string is"+rev);
        sc.close();
    }    
}

