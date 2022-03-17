/**
 * ASCII to Character
 */
import java.util.Scanner;
public class program28 {
    public static void main(String[] args) {
        System.out.println("ASCII to Character");
		System.out.println("******************");
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a ASCII Value (32 to 127) : ");
        int ASCII = input.nextInt();

        input.close();

        char ch = (char) ASCII;     // Explicit type conversion from int to char

        System.out.println("Given ASCII Value : " + ASCII);
        System.out.print("Corresponding Character : " + ch);
    }    
}
