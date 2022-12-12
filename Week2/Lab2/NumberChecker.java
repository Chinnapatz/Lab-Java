package Week2.Lab2;

import java.util.*;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        int x = (int)num;
        if (num < 0) {
            if (x % 2 == 0) {
                if ((num) - x == 0) {
                    System.out.print(num + " is the negative even integer number");
                }
                else {
                    System.out.print(num + " is the negative even real number");
                }
            }
            else {
                if ((num) - x == 0) {
                    System.out.print(num + " is the negative odd integer number");
                }
                else {
                    System.out.print(num + " is the negative odd real number");
                }
            }
        }
        else if (num > 0){
            if (x % 2 == 0) {
                if ((num) - x == 0) {
                    System.out.print(num + " is the positive even integer number");
                }
                else {
                    System.out.print(num + " is the positive even real number");
                }
            }
            else {
                if ((num) - x == 0) {
                    System.out.print(num + " is the positive odd integer number");
                }
                else {
                    System.out.print(num + " is the positive odd real number");
                }
            }
        }
        else {
            System.out.print(num + " is the even integer number");
        }




        sc.close();
    }
    
}
