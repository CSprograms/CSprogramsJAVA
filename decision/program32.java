/**
 * Biggest amonng Two Numbers -- Version 2
 * Using if else
 */
package decision;
import java.util.Scanner;
public class program32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Input 1 : ");
        int input1 = input.nextInt(); 

        System.out.print("Enter Input 2 : ");
        int input2 = input.nextInt();
        input.close();

        int biggest;
        
        if(input1 > input2) {
            biggest = input1;
        }
        else {
            biggest = input2;
        }

        System.out.println("Biggest Value : " + biggest);
    }
}
