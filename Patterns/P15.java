package Patterns;

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(); 

            for(int i=0;i<n;i++){
                for(char ch = 'A'; ch<='A'+(n-i-1);ch++){
                    System.out.print(ch + " ");   
                }
                System.out.println();
            }
        }
    }
}
