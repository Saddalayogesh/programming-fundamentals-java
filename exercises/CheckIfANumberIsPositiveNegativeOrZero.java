import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            System.out.print("Positive");
        } else if (num < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }

        sc.close();
    }
}