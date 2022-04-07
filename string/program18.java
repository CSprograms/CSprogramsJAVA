/**
 * Reading a String
 * next() vs nextLine()
 */
package string;
import java.util.Scanner;
public class program18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string 1 : ");
        String str1 = input.nextLine();

        System.out.print("Enter the string 2 : ");
        String str2 = input.next();

        input.close();

        System.out.println("String 1 : " + str1);
        System.out.print("String 2 : " + str2);        
    }    
}
