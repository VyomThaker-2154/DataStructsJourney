package Patterns;
import java.util.*;

public class P9 {
    static void triangle(int n){
        for(int i=0 ; i <n ; i++){
            for(int j=0 ; j <n-i-1 ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j <2*i+1 ; j++){
                System.out.print("*");
            }
            for(int j=0 ; j <2 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void invertriangle(int n ){
        
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
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            triangle(n);
            invertriangle(n);
        }
    }
}
        
    

