/**
 * Decimal to Octal
 */
import java.util.Scanner;
public class program24{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Decimal Value : ");
        int decimal = input.nextInt(); 

        input.close();
				
		int temp = decimal;
        String octal = "";
        while(temp != 0) {
            octal = (temp % 8) + octal;
            temp /= 8;
        }

        System.out.println("Octal : " + octal);
		
    }
}
