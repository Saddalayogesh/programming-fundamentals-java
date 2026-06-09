import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pricePerKg = sc.nextDouble();
        int quantitySold = sc.nextInt();

        double totalEarnings = pricePerKg * quantitySold;

        System.out.printf("%.2f", totalEarnings);

        sc.close();
    }
}