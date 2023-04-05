/* write a program build a matrix of 5 rows and 3 columns, 
   ask the user to enter the values for all the matrix items
   and print out the sum of all matrix items
*/
//Two Dimensional Array
package ex;

import java.util.Scanner;

public class TwoDimArray {

    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
  
     int [][]matrix = new int[5][3] ;
     fillArray(matrix);
     System.out.println("Matrix filled");
     printArray(matrix);
     int total= sumArray(matrix);
     System.out.println("Matrix will be summed ");
     System.out.println(total);
     
    }
public static void fillArray(int[][] list)
    {
    for (int row=0;row<list.length;row++)
        for (int col=0; col<list[0].length;col++)
        {
         System.out.println("Enter data for Row no "+(row+1)+ " and column no "+(col+1));
         list[row][col]= input.nextInt();
        }
    } 
 public static void printArray(int[][] list)
    {
    for (int row=0;row<list.length;row++)
        for (int col=0;col<list[0].length;col++)
    System.out.println(list[row][col]);
    }
 
 public static int sumArray(int[][] list)
    {
        int sum=0;
    for (int row=0;row<list.length;row++)
        for (int col=0;col<list[0].length;col++)
        
            sum+=list[row][col];
    return sum;
            
    }
}

    
