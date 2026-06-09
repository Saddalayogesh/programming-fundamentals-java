import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 5; i++) {
            total += sc.nextInt();
        }

        System.out.println("Total Marks: " + total);

        if (total >= 450) {
            System.out.println("Grade: A");
        } else if (total >= 400) {
            System.out.println("Grade: B");
        } else if (total >= 350) {
            System.out.println("Grade: C");
        } else if (total >= 300) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}