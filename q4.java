package day24;
import java.util.*;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s =sc.nextLine();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) ==s.charAt(j)){
                    s = s.replace(s.charAt(j),' ');
                }
            }
            
        }
        System.out.println("after remving repeating character is"+s);
        sc.close();
    }
}
    

