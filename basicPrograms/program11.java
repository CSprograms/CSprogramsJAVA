/**
 * Celsius to Fahrenheit
 * Fahrenheit = 32 + ( ( 9 * Celsius ) / 5 )
 */
package basicPrograms;
import java.util.Scanner;
public class program11 {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter the Celsius : ");
        double c = ip.nextDouble();

        ip.close();
        
        double f = 32 + ( ( 9 * c ) / 5 );

        System.out.println("Celsius : " + Math.round(c));
        System.out.print("Fahrenheit : " + Math.round(f));
    }
}
