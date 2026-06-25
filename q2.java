package day25;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        s1 = sc.nextLine();
        String s2 = new String();
        s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(s1.charAt(i) ==s2.charAt(j)){
                    System.out.println(s1.charAt(i));
                }
            }
        }
        sc.close();
    }    
}
    

