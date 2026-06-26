package day26;
import java.util.*;
public class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("NUMBER GUESSING GAME");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=100;i++){
            list.add(i);
        }
        System.out.println("how many chances you want to play");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter a number");
            int num = sc.nextInt();
            for(int j=0;j<list.size();j++){
                if(list.get(j) ==num){
                    System.out.println("your answer is"+num);
                }
            }
        }
        sc.close();
    }
}
