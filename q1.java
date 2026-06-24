
import java.util.*;
public class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.next();
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("String is a pallindrome");
        }
        else{
            System.out.println("String is not a pallindrome");
        }
        sc.close();
    }
}
