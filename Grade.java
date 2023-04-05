
package test3;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    char grade;
    String message;
    System.out.println("Enter Your Grade");
    grade = reader.next().charAt(0);
    switch (grade){
        case 'A':
                System.out.println("Excellent");
        break;
        case 'B':
                System.out.println("Very good");
        break;
        case 'C':
                System.out.println("Good");
        break;
        case 'D':
                System.out.println("Fair");
        break;
        case 'F':
                System.out.println("Failed");
        break;
        default:
                System.out.println("Invailed Grade");
    
    }
        
    }
    
}
