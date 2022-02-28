/**
 * Leap Year
 * Divisible by 4 and 400
 * Non-Divisible by 100
 */
import java.util.Scanner;
public class program27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = input.nextInt();

        input.close();

        boolean divByFour = (year % 4) == 0;
        boolean divByHundred = (year % 100) == 0;
        boolean divByFourHundred = (year % 400) ==0;

        boolean leapYear = divByFour && (!divByHundred || divByFourHundred);

        if(leapYear) {
            System.out.print("The Given year is a Leap Year");
        }
        else {
            System.out.print("The Given year is Not a Leap Year");
        }
    }
    
}
