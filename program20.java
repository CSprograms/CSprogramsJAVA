/**
 * Finding the String Length
 */
import java.util.Scanner;
public class program20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String word = input.next();

        input.close();

        int length = word.length();

        System.out.println("Given String : " + word);
        System.out.println("String Length : " + length);        
    }    
}
