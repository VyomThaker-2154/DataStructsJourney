package Patterns;
import java.util.*;

public class P20 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            pattern20(N);
        }
    }

    static void pattern20(int n) {
        int spaces = 2 * n - 2;
      
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i > n ? 2 * n - i : i;
          
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
          
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
          
            System.out.println();
            spaces = i < n ? spaces - 2 : spaces + 2;
        }
    }
}