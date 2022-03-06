/**
 * Celsius to Fahrenheit
 * Fahrenheit = 32 + ( ( 9 * Celsius ) / 5 )
 */
import java.util.Scanner;
public class program11 {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter the Celsius : ");
        int c = ip.nextInt();

        ip.close();
        
        int f = 32 + (( 9 * c)/5);

        System.out.println("Celsius : " + c);
        System.out.print("Fahrenheit : " + f);
    }
}
