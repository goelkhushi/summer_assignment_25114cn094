package day_21;

import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.next();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            list.add(ch);
        }
        System.out.println(list);
        int countvow =0;
        int countconst =0;
        for(int i=0;i<list.size();i++){
            if("aeiouAEIOU ".indexOf(list.get(i))!=-1){
                countvow++;
            }
            else{
                countconst++;
            }
        }
        System.out.println("count of vowels in string is"+countvow);
        System.out.println("count of constants in string is"+countconst);
        sc.close();
    }    
}
