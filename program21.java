/**
 * Biggest amonng Three Numbers -- Version 1
 * Using if else and logical operator
 */
import java.util.Scanner;
public class program21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Input 1 : ");
        int input1 = input.nextInt(); 

        System.out.print("Enter Input 2 : ");
        int input2 = input.nextInt();

        System.out.print("Enter Input 3 : ");
        int input3 = input.nextInt();
        input.close();

        int biggest;
        
        if(input1 >= input2 && input1 >= input3) {
            biggest = input1;
        }
        else if(input2 >= input3) {
            biggest = input2;
        }
        else {
            biggest = input3;
        }

        System.out.println("Biggest Value : " + biggest);
    }
}
