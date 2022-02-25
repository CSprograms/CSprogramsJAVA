/**
 * Celsius to Fahrenheit
 */
public class program09 {
    public static void main(String[] args){
        int c = 28;
		//Fahrenheit = 32 + ( ( 9 * Celsius ) / 5 )
        int f = 32 + (( 9 * c)/5);

        System.out.println("Celsius : " + c);
        System.out.print("Fahrenheit : " + f);
    }
}
