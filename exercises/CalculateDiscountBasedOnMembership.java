import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String membership = sc.next();
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.print("Invalid amount");
        } else if (!(membership.equals("Gold") || membership.equals("Silver") || membership.equals("Regular"))) {
            System.out.print("Invalid membership");
        } else {
            double finalAmount;

            if (membership.equals("Gold")) {
                finalAmount = amount * 0.70;
            } else if (membership.equals("Silver")) {
                finalAmount = amount * 0.80;
            } else {
                finalAmount = amount * 0.93;
            }

            System.out.print("Final Amount after Discount: " + finalAmount);
        }

        sc.close();
    }
}