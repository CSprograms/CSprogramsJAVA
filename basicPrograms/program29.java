/**
 * Fahrenheit to Celsius
 * Celsius = ( Fahrenheit - 32 ) * ( 5 / 9 )
 */
package basicPrograms;
import java.util.Scanner;
public class program29 {
    public static void main(String[] args){
        System.out.println("Fahrenheit to Celsius");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit : ");
        double f = input.nextDouble();

        input.close();
        
        double c = ( f - 32 ) * ( 5 / 9 );

        System.out.println("Fahrenheit : " + Math.round(f));
        System.out.print("Celsius : " + Math.round(c));
    }
}
