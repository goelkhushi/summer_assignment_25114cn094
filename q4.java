package day25;

import java.util.*;

public class q4 {
    public  static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        int max =0;
        String maxstr = new String();
        for(String num:list){
            int n = num.length();
            if(n>max){
                max = n;
                maxstr = num;
            }
        }
        System.out.println("longest word in a string is"+maxstr);
        sc.close();
    }    
}
    

