import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int costPerDozen = sc.nextInt();
        int dozens = sc.nextInt();
        int discountPercent = sc.nextInt();

        int totalCost = costPerDozen * dozens;
        int discountAmount = (totalCost * discountPercent) / 100;
        int finalAmount = totalCost - discountAmount;

        System.out.println(finalAmount);

        sc.close();
    }
}