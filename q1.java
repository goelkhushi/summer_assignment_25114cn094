package day25;
import java.util.*;


public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1= new String();
        s1 = sc.nextLine();
        char[] s11 = s1.toCharArray();
        String s2 = new String();
        s2 = sc.nextLine();
        char[] s22 = s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s22);
        String s3 = new String();
        int n1 = s11.length;
        int n2 = s22.length;
        int i=0;
        int j=0;
        if(n1==n2){
            while(i<n1&& j<n2){
                char min1 = s11[i];
                char min2 = s22[j];
                if(min1<min2){
                    s3+= min1;
                    i++;
                }
                else if(min2<min1){
                    s3+= min2;
                    j++;
                }
                else{
                    s3+= min1;
                    i++;
                    j++;
                }                                            
            }
            s3+= s11[n1-1];
            s3+= s22[n2-1];
            
            
        }
        System.out.println(s3);
        sc.close();
    }    
}

    

