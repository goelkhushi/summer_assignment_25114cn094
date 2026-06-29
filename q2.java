package day29;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int arr[] ={3,4,5,6,7,2,5,7,8,9,10,5,6,8};
        do{
            System.out.println("MENU DRIVEN ARRAY OPERATIONS SYSYTEM");
            System.out.println("1:DISPLAY THE ARRAY ELEMENTS");
            System.out.println("2:ADD THE ARRAY ELEMENTS ");
            System.out.println(" 3:MAXIMUN OF  ARRAY ELEMNTS");
            System.out.println("4:MINIMUM OF ARRAY ELEMNTS");
            System.out.println("5:AVERAGE OF ARRAY ELEMENTS");
            System.out.println("6:COUNT OF EVEN NUMBERS IN AN ARRAY");
            System.out.println("7:COUNT OF ODD NUMBERS IN AN ARRAY");
            System.out.println("SORT THE ARRAY ELEMENTS");
            System.out.println("REVERSE THE ARRAY ELEMMTS");
            System.out.println("ENTER CHOICE");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Array Elements: ");

                    for (int num : arr) {
                        System.out.print(num + " ");
                    }

                    System.out.println();
                    break;
                case 2:
                    int sum = 0;

                    for (int num : arr) {
                        sum += num;
                    }

                    System.out.println("Sum = " + sum);
                    break;
                case 3:
                    int max = arr[0];

                    for (int num : arr) {

                        if (num > max) {
                            max = num;
                        }
                    }

                    System.out.println("Maximum Element = " + max);

                    break;
                case 4:
                    int min = arr[0];

                    for (int num : arr) {

                        if (num < min) {
                            min = num;
                        }
                    }

                    System.out.println("Minimum Element = " + min);

                    break;
                case 5:
                    sum = 0;

                    for (int num : arr) {
                        sum += num;
                    }

                    double average = (double) sum / arr.length;

                    System.out.println("Average = " + average);

                    break;
                case 6:
                    int even = 0;

                    for (int num : arr) {

                        if (num % 2 == 0)
                            even++;
                    }

                    System.out.println("Total Even Numbers = " + even);

                    break;
                case 7:
                    int odd = 0;

                    for (int num : arr) {

                        if (num % 2 != 0)
                            odd++;
                    }

                    System.out.println("Total Odd Numbers = " + odd);

                    break;
                case 8:
                    for (int i = 0; i < arr.length - 1; i++) {

                        for (int j = i + 1; j < arr.length; j++) {

                            if (arr[i] > arr[j]) {

                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }

                    System.out.print("Sorted Array: ");

                    for (int num : arr) {

                        System.out.print(num + " ");
                    }

                    System.out.println();

                    break;
                case 9:
                    System.out.print("Reverse Array: ");

                    for (int i = arr.length - 1; i >= 0; i--) {

                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();

                    break;
            }
        }
        while(ch!=0);
        System.out.println("THANKS FOR CHOSSING MENU DRIVEN STRING OPERATING SYSYTEM❤️");
        sc.close();
    }
    
}
