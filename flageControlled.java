//flage controlled while loop
package test5;
import java.util.Scanner;
public class flageControlled {

    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
    double sum=0.0;
    double value;
    boolean check= true;
    while (check==true){
         System.out.println("Enter the next positive number");
         value = input.nextDouble();
         if(value<0)
             check=false;
         else 
             sum+=value;   
                       } 
    System.out.println("The sum of input positive numbers is "+sum);
    }
}
