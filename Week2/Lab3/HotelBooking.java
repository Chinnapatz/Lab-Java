package Week2.Lab3;
import java.util.*;


public class HotelBooking {
    public static void main(String[] args) {    
        double total = 0;
        final double EXTRA = 7000;
        final double COMMON = 5000;
        final int BREAKFAST = 150;
        final int TABLE = 500;
        final double SERVICE = 1.75 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to book the hotel room(s)? ");
        String ans1 = sc.nextLine();
        if (ans1.equals("yes")) {
            System.out.print("Please choose a room type: ");
            String ans2 = sc.nextLine();
            if (ans2.equals("extra")) {
                System.out.print("How many rooms ? ");
                double ans3 = sc.nextDouble();
                total = EXTRA*ans3;
                System.out.print("Breakfast included ? ");
                String ans4 = sc.next();
                if (ans4.equals("yes")) {
                    total += ans3*BREAKFAST;
                }
            }
            else {
                System.out.print("How many rooms ? ");
                double ans3 = sc.nextDouble();
                total = COMMON*ans3;  
                System.out.print("Breakfast included ? ");
                String ans4 = sc.next();
                if (ans4.equals("yes")) {
                    total += ans3*BREAKFAST;
                }
            }
        }
        else {
            System.out.print("Do you want to reserve the table(s)? ");
            String ans5 = sc.nextLine();
            if (ans5.equals("yes")) {
                System.out.print("How many table ? ");
                double ans6 = sc.nextDouble();
                    total = ans6*TABLE;   
            }
        }
        double sum = (total*SERVICE/100)+total;
        
        System.out.print("You need to pay "+ sum +" baht (service charge included).");
    
        sc.close();
    }
}