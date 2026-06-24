
import java.util.*;
public class q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        String s1 =new String();
        s = sc.next();
        s1 ="";
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        for(Character num:list){
            if(!s1.contains(String.valueOf(num))){
                int count =0;
                for(int i=0;i<s.length();i++){
                    if(s.contains(String.valueOf(num))){
                    count++;
                    s1 += num;
                }
                }
        
            System.out.println("frequency of num is"+num+" "+count);
            }
        }
        sc.close();
    }
}
