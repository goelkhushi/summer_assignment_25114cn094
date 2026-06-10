package day_10;

public class q4 {
    public static void main(String[] args){
        for (int i=1;i<=5;i++){
            for (int j=i;j<5;j++){
                System.out.print(" ");
            }
            if (i!=1){
                char ch ='A';
                for (int j=i;j<=2*i-1;j++){
                    System.out.print(ch+" ");
                    ch++;
                }
                char c ='A';
                for(int j=i;j<=2*i-2;j++){
                    System.out.print(c+" ");
                    c++;
                }
            }
            else
                System.out.print('A');
            System.out.println();
        }
    }    
}
