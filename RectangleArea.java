// calculate the area of a rectangle
package JavaApp;
import java.util.Scanner;
public class JavaApp{

    public static void main(String[] args) {
      
        Scanner input =new Scanner(System.in);
        int lenght, width,area;
        System.out.println("Enter the lenght");
        lenght = input.nextInt();
        System.out.println("Enter the width");
        width = input.nextInt();
        area = lenght * width;
        System.out.printf("Area = %d",area);
        
        
       
    }
    
}
