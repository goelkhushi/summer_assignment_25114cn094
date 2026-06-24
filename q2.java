import java.util.*;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.next();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        int count =list.size();
        System.out.println("number of words in a sentence is"+count);
        sc.close();
    }     
}

