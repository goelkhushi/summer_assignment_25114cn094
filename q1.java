package day24;
import java.util.*;

public class q1{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        char[] s1 = s.toCharArray();
        int n =s1.length;
        for(int i=0;i<n-1;i++){
            char ch = s1[i];
            for(int j=i+1;j<n;j++){
                s1[j-1] = s1[j];
            }
            s1[n-1] = ch;
        }
        System.out.println(s1);
        sc.close();
    }
}

    

