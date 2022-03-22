/**
 * Biggest amonng Two Numbers -- Version 4
 * Using Math.max(int,int)
 */
import java.util.Scanner;
public class program34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Input 1 : ");
        int input1 = input.nextInt(); 

        System.out.print("Enter Input 2 : ");
        int input2 = input.nextInt();
        input.close();

        int biggest = Math.max( input1, input2 );
        
        System.out.println("Biggest Value : " + biggest);
    }
}
