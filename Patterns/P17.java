package Patterns;

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(); 

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
                char ch = 'A';
                for (int j = 0; j <= i; j++) System.out.print(ch++);
                ch--;
                for (int j = 1; j <= i; j++) System.out.print(--ch);

                System.out.println();
             }
          
        }
    }
    
}
