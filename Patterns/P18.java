package Patterns;

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(); 

            for(int i=0;i<n;i++){
                for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
                    
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
          
        }
    }
}
