/**
 * Decimal to Hexa-Decimal
 */
package iteration;
import java.util.Scanner;
public class program25{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Decimal Value : ");
        int decimal = input.nextInt(); 

        input.close();
		
		System.out.println("Decimal : " + decimal);

        int temp = decimal;
        String hexa = "";
        int reminder;
        
        while(temp != 0) {
            reminder = temp%16;

            if( reminder < 10 ) {
                hexa = reminder + hexa;
            }
            else{
                switch(reminder) {
                    case 10:
                    hexa = "A" + hexa;
                    break;
                    case 11:
                    hexa = "B" + hexa;
                    break;
                    case 12:
                    hexa = "C" + hexa;
                    break;
                    case 13:
                    hexa = "D" + hexa;
                    break;
                    case 14:
                    hexa = "E" + hexa;
                    break;
                    case 15:
                    hexa = "F" + hexa;
                    break;
                }
            }
            temp /= 16;
        }
        System.out.println("Hexa Decimal : " + hexa);
    }
}
