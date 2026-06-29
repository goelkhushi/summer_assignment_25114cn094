package day28;
import java.util.*;

class Account{
    int accountnumber ;
    String accountholder;
    String accounttype;
    int balance ;
    Account(int accountnumber,String accountholder,String accounttype,int balance){
        this.accountnumber = accountnumber;
        this.accountholder = accountholder;
        this.accounttype = accounttype;
        this.balance = balance;
    }
    void Display(){
        System.out.println("1:ACCOUNT NUMBER"+accountnumber);
        System.out.println("2:accountholder"+accountholder);
        System.out.println("3:ACCOUNTTYPE"+accounttype);
    }
}
public class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> account = new ArrayList<>();
        int ch;
        do{
            System.out.println("1:ADD ACCOUNT");
            System.out.println("2: VIEW ACCOUNT");
            System.out.println("3:DEPOSIT MONEY");
            System.out.println("4:WITHDRAWAL MONEY");
            System.out.println("5:DELETE ACCOUNT");
            System.out.println("0:EXIT");
            System.out.println("ENTER CHOICE");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("ADD ACCOUNT");
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    boolean exists = false;

                    for (Account a : account) {
                        if (a.accountnumber == accNo) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Account Number Already Exists.");
                        break;
                    }

                    System.out.print("Enter Holder Name: ");
                    String accountholder = sc.nextLine();

                    System.out.print("Enter Account Type (Saving/Current): ");
                    String accounttype = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    int balance = sc.nextInt();

                    account.add(new Account(accNo, accountholder, accounttype, balance));

                    System.out.println("Account Created Successfully.");
                    break;
                case 2:
                    if (account.isEmpty()) {
                        System.out.println("No Accounts Found.");
                    } else {
                        for (Account a : account) {
                            a.Display();
                        }
                    }

                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int depositAcc = sc.nextInt();

                    boolean deposited = false;

                    for (Account a : account) {

                        if (a.accountnumber == depositAcc) {

                            System.out.print("Enter Deposit Amount: ");
                            int amount = sc.nextInt();

                            if (amount > 0) {
                                a.balance += amount;
                                System.out.println("Deposit Successful.");
                                System.out.println("New Balance: ₹" + a.balance);
                            } else {
                                System.out.println("Invalid Amount.");
                            }

                            deposited = true;
                            break;
                        }
                    }

                    if (!deposited)
                        System.out.println("Account Not Found.");

                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    int withdrawAcc = sc.nextInt();

                    boolean withdrawn = false;

                    for (Account a : account) {

                        if (a.accountnumber == withdrawAcc) {

                            System.out.print("Enter Withdrawal Amount: ");
                            int amount = sc.nextInt();

                            if (amount <= a.balance) {
                                a.balance -= amount;
                                System.out.println("Withdrawal Successful.");
                                System.out.println("Remaining Balance: ₹" + a.balance);
                            } else {
                                System.out.println("Insufficient Balance.");
                            }

                            withdrawn = true;
                            break;
                        }
                    }
                    if (!withdrawn)
                        System.out.println("Account Not Found.");

                    break;
                case 5:
                    System.out.print("Enter Account Number to Delete: ");
                    int delete = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < account.size(); i++) {

                        if (account.get(i).accountnumber == delete) {

                            account.remove(i);

                            System.out.println("Account Deleted Successfully.");

                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Account Not Found.");

                    break;
                case 0:
                    System.out.println("Exiting Bank Account Management.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        } while(ch!=0);
        System.out.println("PROGRAM IS FINISHED UP😑");
        sc.close();
    }
}

