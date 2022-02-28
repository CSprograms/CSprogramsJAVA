/**
 * String Comparison - Non Case Sensitive
 */
import java.util.Scanner;
public class program26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first string : ");
        String string1 = input.nextLine();

        System.out.print("Enter the second string : ");
        String string2 = input.nextLine();

        input.close();

        System.out.println("String 1 : " + string1);
        System.out.println("String 2 : " + string2);

        if (string1.toLowerCase().equals(string2.toLowerCase())) {
            System.out.print("Both the strings are identical");
        }
        else {
            System.out.print("Strings are non identical");            
        }
    }
}
