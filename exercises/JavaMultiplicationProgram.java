import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num <= 0) {
            System.out.print("Invalid Input");
        } else {
            System.out.println("Multiplication Table of " + num + ":");
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }

        sc.close();
    }
}