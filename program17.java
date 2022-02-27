/**
 * String Read, Write and Length
 */
import java.util.Scanner;
public class program17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String word = input.nextLine();

        input.close();

        int length = word.length();

        System.out.println("Given String : " + word);
        System.out.print("String Length : " + length);
    }    
}
