
import java.util.*;

public class q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        String s1 = new String();
        s1 = "";
        for(int i=0;i<s.length() ;i++){
            char ch= s.charAt(i);
            if(ch ==' '){
                continue;
            } 
            else{
                s1+= ch;
            }
        }
        System.out.print("after removing a space is"+s1);
        sc.close();
    }    
}

