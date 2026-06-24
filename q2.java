package day24;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        char[] s1 = s.toCharArray();
        String s2 ="";
        char count1 =' ';
        for (int i=0;i<s1.length;i++){
            int count =0;
            if(!s2.contains(String.valueOf(s1[i]))){
                for(int j=i+1;j<s1.length;j++){
                    if(s1[i] == s1[j]){
                        count++;
                    }
                }
            }
            if(count>0){
                count1 = (char) count;
                s2+= s1[i];
                s2+= count1;
            }
            else{
                s2+= s1[i];
            }
        }
        System.out.println("before compressing a string is"+s);
        System.out.println("after compressing a string is"+s2);
        sc.close();
    }
}

    

