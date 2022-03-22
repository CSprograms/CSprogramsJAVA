/**
 * Biggest amonng Two Numbers -- Version 3
 * Using Simple if
 */
import java.util.Scanner;
public class program33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Input 1 : ");
        int input1 = input.nextInt(); 

        System.out.print("Enter Input 2 : ");
        int input2 = input.nextInt();
        input.close();

        int biggest = input1;
        
        if( input2 > biggest ) {
            biggest = input2;
        }

        System.out.println("Biggest Value : " + biggest);
    }
}

