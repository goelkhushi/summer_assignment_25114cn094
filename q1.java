package day28;
import java.util.*;

class Book{
    String book_id;
    String author;
    String title;
    boolean isissued =false;
    Book(String book_id,String author,String title){
        this.book_id =book_id;
        this.author = author;
        this.title = title;
    }
    void Display(){
        System.out.println("1:BOOK ID"+book_id);
        System.out.println("2:AUTHOR "+author);
        System.out.println("3:TITLE"+title);
        if(isissued){
            System.out.println("STATUS     :ISSUED");
        }
        else{
            System.out.println("STATUS      :AVAILABLE");
        }
    }
}
public class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        int ch;
        do{
            System.out.println("1:ADD BOOK");
            System.out.println("2: VIEW BOOKS");
            System.out.println("3:ISSUE BOOK");
            System.out.println("4:RETURN BOOK");
            System.out.println("5:DELETE BOOK");
            System.out.println("ENTER CHOICE");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("ENTER A BOOK ID");
                    String bookid =sc.nextLine();
                    int p=0;
                    for(Book b:book){
                        if(b.book_id == bookid){
                            p=1;
                            break;
                        }
                    }
                    if(p==0){
                        System.out.println("ENTER A NEW BOOK ID");
                        String book_id =sc.nextLine();
                        System.out.println("ENTER A NEW AUTHOR");
                        String author = sc.nextLine();
                        System.out.println("ENTER A NEW TITLE");
                        String title  = sc.nextLine();
                        book.add(new Book(book_id, author, title));
                    }
                    else{
                        System.out.println("BOOK ID ALREAY REGISTERD");
                    }
                    break;
                case 2:
                    System.out.println("VIEW BOOKS");
                    if(book.isEmpty()){
                        System.out.println("NO DATA IS AVAILABLE");
                    }
                    else{
                        for(Book b:book){
                            b.Display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("ISSUE BOOK");
                    System.out.println("ENTER A BOOK ID WHICH YOU ISSUED");
                    bookid = sc.nextLine();
                    p =0;
                    for(Book b:book){
                        if(b.book_id ==bookid){
                            if(!b.isissued){
                                b.isissued =true;
                                System.out.println("BOOK IS ISSUED SUCEESFULY");
                            }
                            else{
                                System.out.println("BOOK IS ALREADY ISSUED");
                            }
                            p=1;
                            break;                            
                        }
                    }
                    if(p==0){
                        System.out.println("BOOK IS NOT FOUND");
                    }
                    break;
                case 4:
                    System.out.println("RETURN BOOK");
                    System.out.println("ENTER A BOOK ID WHICH YOU RETURN");
                    bookid =sc.nextLine();
                    p=0;
                    for(Book b:book){
                        if(b.book_id ==bookid){
                            if(b.isissued){
                                b.isissued =false;
                                System.out.println("BOOK IS RETURNED SUCCESFULLY");
                            }
                            else{
                                System.out.println("BOOK IS ALREADY RETURNED");
                            }
                            p=1;
                            break;
                        }
                    }
                    if(p==0){
                        System.out.println("BOOK IS NOT FOUND");
                    }
                    break;
                case 5:
                    System.out.println("DELETE BOOK");
                    System.out.println("ENTER A BOOK ID  YOU WANT TO DELETE");
                    bookid = sc.nextLine();
                    p=0;
                    for(Book b:book){
                        if(b.book_id==bookid){
                            p=1;
                            break;
                        }
                    }
                    if(p==1){
                        for(int i=0;i<book.size();i++){
                            if(book.get(i).book_id==bookid){
                                book.remove(i);
                            }
                        }
                    }
                    else{
                        System.out.println("BOOK IS NOT FOUND");
                    }
                    break;
                default:
                    System.out.println("THANK YOU FOR CHOOSIND LIBRARAY MANAGEMENT😍");
            }
        } while(ch!=0);
        System.out.println("PROGRAM IS FINISHED UP😑");
        sc.close();
    }
}
