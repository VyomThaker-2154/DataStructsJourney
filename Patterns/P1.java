package Patterns;
import java.util.*;

public class P1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            int n = scanner.nextInt();
            
            for(int i=0 ; i < n ; i++){
                for(int j=0 ; j < n ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            
        }

    }
}
