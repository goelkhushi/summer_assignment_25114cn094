package day23;
import java.util.*;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        String s2 = new String();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        String s31 ="";
        String s32 ="";
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        if(s1.length() == s2.length()){
            for(int i =0;i<s1.length()-1;i++){
                int count =0;
                char ch = s1.charAt(i);
                if(!s31.contains(String.valueOf(ch))){
                    for(int j=i+1;j<s1.length();j++){
                        count++;
                    }
                }
                list1.add(count);
                s31+= ch;
            }
            for(int i=0;i<s2.length()-1;i++){
                int count =0;
                char ch = s2.charAt(i);
                if(!s32.contains(String.valueOf(ch))){
                    for(int j=i+1;j<s2.length();j++){
                        count++;
                    }
                }
                list2.add(count);
                s32+= ch;            
            }
            if(list1.equals(list2)){
                System.out.println("String is an anagram");
            }
        sc.close();
        }        
    }    
}

