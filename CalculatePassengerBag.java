// repeation statement & selection statement 
// Calculate the weight of a passenger bag
package example_1;
import java.util.Scanner;
public class CalculatePassengerBag {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    char passClass;
    int numOfPass; 
    double numOfGroup, bagWeight ,excessWeight ,charge = 0;
    System.out.println("Enter Number Of Groups" );
    numOfGroup=input.nextInt();
    System.out.println("Enter Number Of Passengers" );
    numOfPass=input.nextInt();
    
    for(int count=1;count<=numOfPass;count++){
    System.out.println("Enter Passenger's Class For Passenger No "+count);
    passClass= input.next().charAt(0);
    System.out.println("Enter Bag Weight");
    bagWeight= input.nextDouble();
    
    
    switch (passClass){
        case 'F':
        case'f':    
            if (bagWeight >30){
                excessWeight= bagWeight - 30;
                charge = excessWeight * 10;}
            break;
       case 'B':
       case 'b':
            if (bagWeight >25){
                excessWeight= bagWeight - 25;
                charge = excessWeight * 10;}    
            break;
        case 'E':
        case 'e':
            if (bagWeight >30){
                excessWeight= bagWeight - 20;
                charge = excessWeight * 10;}
            break;
        default:
            System.out.println("You Entered Invalid Class");
    }  
    System.out.println("You Have To Pay Extra Charge equal " +charge);
    }
    }
    }
    

