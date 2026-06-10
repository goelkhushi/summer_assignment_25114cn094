package day_10;

public class q2 {
    public static void main(String[] args){
        for (int i=1;i<=5;i++){
            for (int j=i;j <2*i;j++){
                if (i==1){
                    for(int k =1;k<10;k++){
                        System.out.print("*");
                    }
                }
                else
                    System.out.print(" ");
            }
            if(i!=1){
                for (int j =i; j<10-i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }   
}
