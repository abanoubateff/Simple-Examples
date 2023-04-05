// Exception Handling
package testexception;
import java.util.Scanner;
public class TestException {

    public static void main(String[] args) {
        
         try
    {   
    int x=10 ,y;
    Scanner input = new Scanner(System.in); 
    
    System.out.println("enter x");
    x= input.nextInt();
     
    System.out.println("enter y");
    y= input.nextInt();
     
     
    System.out.println(x/y);
    }
         
         
    catch (Exception e)
    {
    System.out.println(e.getMessage());
    }
         
         
    }
    
}
