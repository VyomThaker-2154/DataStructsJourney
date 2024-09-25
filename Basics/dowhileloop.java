package Basics;
import java.util.*;

public class dowhileloop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            do{
                System.out.println("hello");
                n++;
            }while(n <= 4);
        }

    }
    
}
