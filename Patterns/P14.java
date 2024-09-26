package Patterns;
import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(); 

            for(int i=0;i<n;i++){
                for(char ch = 'A'; ch<='A'+i;ch++){
                    System.out.print(ch + " ");   
                }
                System.out.println();
            }
        }
    }
    
}
