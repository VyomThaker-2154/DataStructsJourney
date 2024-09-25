package Patterns;
import java.util.*;

public class P10 {
    static void triangle(int n){
        for(int i=0 ; i <=n ; i++){
            for(int j=0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     static void invertriangle(int n){
        
        for(int i=n-1 ; i > 0 ; i--){
            for(int j=1 ; j <=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            triangle(n);
            invertriangle(n);
        }
     }
}
