/**
 * Swaping -- with temporary variable
 */
package basicPrograms;
import java.util.Scanner;
public class program21 {
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

        int temp = input1;
        input1 = input2;
        input2 = temp;

        System.out.println("After Swap");
        System.out.println("Input 1 : " + input1);
        System.out.println("Input 2 : " + input2);

    }
}
