package Patterns;
import java.util.*;

public class P4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            int n = scanner.nextInt();
            
            for(int i=1 ; i <=n ; i++){
                for(int j=1 ; j <=i ; j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
