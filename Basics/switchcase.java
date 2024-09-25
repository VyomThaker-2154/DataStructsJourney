package Basics;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         switch(n){ 
            case 1:
            System.out.println("hello");
            break;
            case 2:
            System.out.println("hi");
            break;
            case 3:
            System.out.println("hell o ");
            break;
            default:System.out.println("error");
            
         }

    }
    
}
