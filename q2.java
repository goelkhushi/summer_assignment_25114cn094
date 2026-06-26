package day26;
import java.util.*;

public class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("VOTING ELGIBILITY CRITRIEA");
        System.out.println("enter a age of person");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("elgible");
        }
        else{
            System.out.println("not eligble");
        }
        sc.close();
    }
}
    

