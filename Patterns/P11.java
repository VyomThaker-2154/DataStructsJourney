package Patterns;
import java.util.*;

public class P11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for(int i=0 ; i <=n ; i++){
                for(int j=0 ; j < i ; j++){
                    if((i+j)%2==0)
                    System.out.print("0");
                    else
                    System.out.print("1");
                }
                System.out.println();
            }
        }
    }
    
}
