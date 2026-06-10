package day_10;

public class q3 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System .out.print(" ");
            }
            if(i!=1){
                int p =1;
                for(int j=i;j<=2*i-1;j++){
                    System.out.print(p+" ");
                    p++;
                }
                int k =1;
               for(int j=i; j<=2*i-2;j++){
                    System.out.print(k+" ");
                    k++;
                }
                System.out.println();
            }
            else{
                System.out.print(1+" ");
            }
            System.out.println();
        }        
    }    
}
