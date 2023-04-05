//Calculate The sum of even and odd numbers 

package test6;
import java.util.Scanner;
public class SumEvenOdd {

    
    public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
          int num,sum_even=0,sum_odd=0;
     
          for (int i=1;i<=10;i++){
          System.out.println("Enter number "+i);
          num= input.nextInt();
          if (num %2==0)
              sum_even+=num;
          else
              sum_odd+=num;
          }
    System.out.println("The sum of even numbers "+sum_even);
    System.out.println("The sum of odd numbers "+sum_odd);
    }
    
}
