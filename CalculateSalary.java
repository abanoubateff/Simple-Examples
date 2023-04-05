
package test;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        
        // TODO code application logic here
         Scanner input =new Scanner(System.in);
         String name ="";
         float salary , Net_salary;
         System.out.println("Enter the first name");
         name = input.next();
         System.out.println("Enter the Salary");
         salary = input.nextFloat();
         Net_salary= salary -(salary * 0.10f);
         System.out.printf("The Net Salary %f",Net_salary);
            
     
    }
    
}
