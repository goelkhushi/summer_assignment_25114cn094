package day29;
import java.util.*;

public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        int ch;
        do{
            System.out.println("MENU DRIVEN STRING OPERATION SYSTEM🧵");
            System.out.println("\n========== STRING OPERATIONS ==========");
            System.out.println("1. Display String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Check Palindrome");
            System.out.println("7. Count Vowels");
            System.out.println("8. Count Consonants");
            System.out.println("9. Search Character");
            System.out.println("10. Exit");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();
            switch (ch) {

                case 1:
                    System.out.println("String = " + s);
                    break;

                case 2:
                    System.out.println("Length = " + s.length());
                    break;

                case 3:
                    System.out.println("Uppercase = " + s.toUpperCase());
                    break;

                case 4:
                    System.out.println("Lowercase = " + s.toLowerCase());
                    break;

                case 5:

                    String rev = "";

                    for (int i = s.length() - 1; i >= 0; i--) {
                        rev += s.charAt(i);
                    }

                    System.out.println("Reverse = " + rev);

                    break;

                case 6:

                    rev = "";

                    for (int i = s.length() - 1; i >= 0; i--) {
                        rev += s.charAt(i);
                    }

                    if (s.equalsIgnoreCase(rev))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not a Palindrome");

                    break;

                case 7:

                    int vowels = 0;

                    for (int i = 0; i < s.length(); i++) {

                        char ch1 = Character.toLowerCase(s.charAt(i));

                        if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i'
                                || ch1 == 'o' || ch1== 'u') {

                            vowels++;
                        }
                    }

                    System.out.println("Total Vowels = " + vowels);

                    break;

                case 8:

                    int consonants = 0;

                    for (int i = 0; i < s.length(); i++) {

                        char ch1 = Character.toLowerCase(s.charAt(i));

                        if (Character.isLetter(ch1)) {

                            if (!(ch1 == 'a' || ch1 == 'e' || ch1 == 'i'
                                    || ch1 == 'o' || ch1 == 'u')) {

                                consonants++;
                            }
                        }
                    }

                    System.out.println("Total Consonants = " + consonants);

                    break;

                case 9:

                    System.out.print("Enter Character to Search: ");
                    char key = sc.next().charAt(0);

                    boolean found = false;

                    for (int i = 0; i < s.length(); i++) {

                        if (s.charAt(i) == key) {

                            System.out.println("Character Found at Index " + i);

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Character Not Found.");

                    break;

                case 10:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (ch != 10);

        sc.close();
    }
}
