package day16;
import java.util.*;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter a size of an array");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("enter a target");
        int target = sc.nextInt();
        int sum =0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                sum = list.get(i) + list.get(j);
                if(sum == target){
                    System.out.println(+list.get(i)+ " "+ list.get(j)+ "  " +sum);
                }
            }
        }
        sc.close();
    }    
}
