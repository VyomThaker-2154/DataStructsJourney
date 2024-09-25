package Patterns;
import java.util.*;

public class P6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            int n = scanner.nextInt();
            
            for(int i=n ; i >0 ; i--){
                for(int j=1 ; j <=i ; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    
}
