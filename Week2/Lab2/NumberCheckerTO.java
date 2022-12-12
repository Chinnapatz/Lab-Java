package Week2.Lab2;
import java.util.*;
public class NumberCheckerTO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        int x = (int)num;
        String a = (num < 0) && (x % 2 == 0) && (num) - x == 0 ? " negative even integer":
                   (num < 0) && (x % 2 == 0) && (num) - x != 0 ? " negative even real": 
                   (num < 0) && (x % 2 != 0) && (num) - x == 0 ? " negative odd integer": 
                   (num < 0) && (x % 2 != 0) && (num) - x != 0 ? " negative odd real": 
                   (num > 0) && (x % 2 == 0) && (num) - x == 0 ? " positive even integer":
                   (num > 0) && (x % 2 == 0) && (num) - x != 0 ? " positive even real":  
                   (num > 0) && (x % 2 != 0) && (num) - x == 0 ? " positive odd integer": 
                   (num > 0) && (x % 2 != 0) && (num) - x != 0 ? " positive odd real":" even integer" ;
        System.out.print(num + " is the"+ a +" number");
        sc.close();
    }
}

