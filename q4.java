package day_21;

import java.util.*;

public class q4 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = new String();
        s = sc.next();
        int countlower =0;
        int countupper =0;
        for(int i=0;i<s.length();i++){
            char  ch= s.charAt(i);
            if(Character.isUpperCase(ch)){
                countupper++;
            }
            else if(Character.isLowerCase(ch)){
                countlower++;
            }
        }
        System.out.println("count of lower case is"+countlower);
        System.out.println("count of upper case is"+countupper);
        sc.close();

    }
    
}
