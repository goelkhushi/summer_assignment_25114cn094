package day24;
import java.util.*;

public class q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        int max = 0;
        String str = new String();
        for(String num:list){
            int count = num.length();
            if(count > max){
                max = count;
                str = num;
            }            
        }
        System.out.println("longest word of a string is "+str);
        sc.close();        
    }
}


