package Basics;
import java.util.*;

public class whileloop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            while(n <= 4){
                System.out.println("hello");
                n++;
            }
        }

    }
    
}
