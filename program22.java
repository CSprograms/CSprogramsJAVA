/**
 * Swaping -- without temporary variable
 */
import java.util.Scanner;
public class program22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Input 1 : ");
        int input1 = input.nextInt(); 

        System.out.print("Enter Input 2 : ");
        int input2 = input.nextInt();
        
        input.close();

        System.out.println("Before Swap");
        System.out.println("Input 1 : " + input1);
        System.out.println("Input 2 : " + input2);

        input1 = input1 + input2;
        input2 = input1 - input2;
        input1 = input1 - input2;

        System.out.println("After Swap");
        System.out.println("Input 1 : " + input1);
        System.out.println("Input 2 : " + input2);

    }
}
