//determine the even and odd numbers & (Positive number or Negative number) 
package test2;
import java.util.Scanner;

public class Even_OddNumbers{

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;
    System.out.println("Enter the number");
    number = input.nextInt();
    if (number > 0){
       if (number %2== 0)
    {
        System.out.println("Positive number");
        System.out.println("Even number");
    }
        else {
        System.out.println("Positive number");
        System.out.println("Odd number");
       }
    }
    else if (number ==0){System.out.println("The number is Zero");}
    
    else {
        if (number %2== 0)
        {
        System.out.println("Negative number");
        System.out.println("Even number");
        }
        else {
        System.out.println("Negative number");
        System.out.println("Odd number");
              } 
         }
        
        
    }
    
}
