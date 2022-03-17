/**
 * Character to ASCII
 */
import java.util.Scanner;
public class program27{
    public static void main(String[] args) {
		System.out.println("Character to ASCII");
		System.out.println("******************");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char ch = input.next().charAt(0);

        input.close();

        int ASCII = ch;     // Implicit type conversion from char to int

        System.out.println("Given Character : " + ch);
        System.out.print("ASCII Value : " + ASCII);
    }
}
