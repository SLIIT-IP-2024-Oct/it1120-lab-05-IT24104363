import java.util.Scanner;

public class IT24104363Lab5Q3 {

    
    private static final int ROOM_CHARGE_PER_DAY = 48000;
    private static final int MIN_DAY = 1;
    private static final int MAX_DAY = 31;
    private static final double DISCOUNT_3_4_DAYS = 0.10;
    private static final double DISCOUNT_5_OR_MORE_DAYS = 0.20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the start date (day): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (day): ");
        int endDate = scanner.nextInt();

        
        if (startDate < MIN_DAY || startDate > MAX_DAY) {
            System.out.println("Error: Start date must be between " + MIN_DAY + " and " + MAX_DAY + ".");
            return;
        }

        if (endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: End date must be between " + MIN_DAY + " and " + MAX_DAY + ".");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        
        int daysReserved = endDate - startDate;

   
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discount = 0;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discount = totalAmount * DISCOUNT_3_4_DAYS;
        } else if (daysReserved >= 5) {
            discount = totalAmount * DISCOUNT_5_OR_MORE_DAYS;
        }

        double finalAmount = totalAmount - discount;

   
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.printf("Total amount to be paid: Rs %.2f\n", finalAmount);

        scanner.close();
    }
}