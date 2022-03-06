/**
 * Celsius to Fahrenheit
 * Fahrenheit = 32 + ( ( 9 * Celsius ) / 5 )
 */
public class program11 {
    public static void main(String[] args){
        int c = 28;
        
        int f = 32 + (( 9 * c)/5);

        System.out.println("Celsius : " + c);
        System.out.print("Fahrenheit : " + f);
    }
}
