package day_9;

public class q4 {
    public static void main(String[] args){
        for (int i=1;i<=9;i++){
            for (int j=1;j<=5;j++){
                if (i%2==0){
                    System.out.println(" ");
                }
                else {
                    if (i==1||i==9||j==1||j==5){
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
            }                
        }
            System.out.println();
    }
}
        

