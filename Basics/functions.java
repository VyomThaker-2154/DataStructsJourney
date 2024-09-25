package Basics;
import java.util.*;

public class functions {
       

        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                addition(a,b);
            }
        }
         public static void addition (int a,int b){
            int sum = a+b;
            System.out.println(sum);
        }

    }
    

