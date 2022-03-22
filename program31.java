/**
 * Biggest amonng Two Numbers -- Version 1
 * Using Ternary Operator
 */
import java.util.Scanner;
public class program31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Input 1 : ");
        int input1 = input.nextInt(); 

        System.out.print("Enter Input 2 : ");
        int input2 = input.nextInt();
		
        input.close();

        int biggest = input1 > input2 ? input1 : input2;

        System.out.println("Biggest Value : " + biggest);
    }
}
