/**
 * Decimal to Binary
 */
import java.util.Scanner;
public class program23{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Decimal Value : ");
        int decimal = input.nextInt(); 

        input.close();
		
		System.out.println("Decimal : " + decimal);

        int temp = decimal;
        String binary = "";
        while(temp != 0) {
            binary = (temp % 2) + binary;
            temp /= 2;
        }

        System.out.println("Binary : " + binary);
		
    }
}
