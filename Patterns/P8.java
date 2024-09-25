package Patterns;
import java.util.*;

public class P8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            int n = scanner.nextInt();
            
            for(int i=0 ; i <n ; i++){
                for(int j=0 ; j <i ; j++){
                    System.out.print(" ");
                }
                for(int j=0 ; j < 2*n-2*i-1 ; j++){
                    System.out.print("*");
                }
                for(int j=0 ; j <i ; j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
