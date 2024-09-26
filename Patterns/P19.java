package Patterns;

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();

            // Upper part of the pattern
            for (int i = 1; i <= N; i++) {
                // Print stars
                for (int j = 1; j <= N - i; j++) {
                    System.out.print("*");
                }

                // Print spaces
                for (int j = 1; j <= 2 * i - 2; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int j = 1; j <= N - i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 2 * (N - i); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
