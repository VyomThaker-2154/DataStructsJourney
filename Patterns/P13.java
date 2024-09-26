package Patterns;
import java.util.*;

public class P13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int count = 1;

            for(int i=1;i<=n ;i++){
                for(int j=0 ;j<i ;j++){
                    System.out.print(count);
                    count++;
                }
                System.out.println();
            }
        }
    }
    
}
