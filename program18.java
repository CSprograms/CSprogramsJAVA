/**
 * String Read, Write and Length
 */
import java.util.Scanner;
public class program18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String word = input.nextLine();

        input.close();

        int length=0;

        for(char ch : word.toCharArray()) {
            ++length;
        }
        
        System.out.println("Given String : " + word);
        System.out.println("String Length : " + length);

        
    }    
}
