package day_21;
import java.util.*;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.next();
        int count =0;
        for(int i=0;i<s.length();i++){
            count++;
        }
        System.out.println("length of a string is"+count);
        sc.close();
    }    
}

