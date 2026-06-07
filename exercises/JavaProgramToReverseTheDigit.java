import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original < 0) {
            reversed = -reversed;
        }

        System.out.print(reversed);

        sc.close();
    }
}