package day26;
import java.util.*;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" WELOCOME TO ATM MACHINE");
        System.out.println("1: CHECK BALANCE");
        System.out.println("2: DEPOSIT");
        System.out.println("3:WITHDRWAL");
        System.out.println("4: TRANSACTION HISTORY");
        System.out.println("5:RESET PIN");
        System.out.println("6:EXIT");
        int balance = 10000;
        System.out.println("ENTER CHOICE ");
        int ch = sc.nextInt();
        int currentpin = 1234;
        ArrayList<String> history = new ArrayList<>();
        switch(ch){
            case 1:
                System.out.println("ENTER YOUR CURRENT PIN ");
                int pin = sc.nextInt();
                if(currentpin == pin){
                    System.out.println("YOUR CURRENT BALANCE IS"+balance);
                }
                else{
                    System.out.println("WRONG PIN");
                }
                break;
            case 2:
                System.out.println("ENTER A MONEY YOU DEPOSIT");
                int deposit = sc.nextInt();
                System.out.println("ENTER YOUR CURRENT PIN");
                pin =sc.nextInt();
                if(currentpin ==pin){
                    balance+= deposit;
                    history.add(" DEPOSITED"+deposit);
                }
                else{
                    System.out.println("WRONG PIN");
                }
                break;
            case 3:
                System.out.println("ENTER A MONEY YOU WITHDRWAL");
                int withdrwal = sc.nextInt();
                System.out.println("ENTER YOUR CURRENT PIN");
                pin = sc.nextInt();
                if(currentpin ==pin){
                    if(withdrwal<=balance){
                        balance-= withdrwal;
                        System.out.println("YOUR TRANSACTION IS SUCCESFUL");
                        history.add("WITHDRWAL"+withdrwal);
                    }
                    else{
                        System.out.println("INSUFFICINET BALANCE");
                    }
                }
                else{
                    System.out.println("WRONG PIN");
                }
                break;
            case 4:
                System.out.println("CHECK YOUR TRANSACTION HISTORY");
                System.out.println("ENTER YOUR CURRENT PIN");
                pin = sc.nextInt();
                if(currentpin == pin){
                    for(String trans:history){
                        System.out.println(trans);
                    }
                }
                else{
                    System.out.println("WRONG PIN");
                }
                break;
            case 5:
                System.out.println("RESET PIN");
                System.out.println("ENTER YOUR CURRENT PASSWORD");
                pin = sc.nextInt();
                if(currentpin == pin){
                    System.out.println("ENTER A NEW PIN");
                    int newpin =sc.nextInt();
                    currentpin = newpin;
                    System.out.println("PIN IS RESET SUCCSEFULLY");
                }
                else{
                    System.out.println("WRONG PIN");
                }
                break;
            case 6:
                System.out.println("EXIT");
                break;
            }
        sc.close();                                          
    }    
}

