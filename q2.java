package day23;
import java.util.*;

public class q2 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String s =new String();
        s = sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        String s1 ="";
        for(int i=0;i<s.length()-1;i++){
            int count =0;
            char ch = s.charAt(i);
            if(!s1.contains( String.valueOf(ch))){
                for(int j=i+1;j<s.length();j++){
                    if(ch == s.charAt(j)){
                        count++;
                    }
                }             
            }
            list.add(count);
            s1 += ch;  
        }
        for(int i=0;i<list.size();i++){
            if (list.get(i) !=0){
                System.out.println(s1.charAt(i));
                break;
            }
        }
        sc.close();
    }   
}


