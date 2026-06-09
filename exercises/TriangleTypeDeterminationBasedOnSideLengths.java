import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.print("Not a valid triangle");
        } else if (a == b && b == c) {
            System.out.print("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.print("Isosceles");
        } else {
            System.out.print("Scalene");
        }

        sc.close();
    }
}