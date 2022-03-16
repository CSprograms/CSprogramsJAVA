/**
 * Degree to Radian
 */
import java.util.Scanner;
public class program26{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Degree Value : ");
        int degree = input.nextInt(); 

        input.close();
		
		System.out.println("Degree Value : " + degree);

        System.out.print("Radian Value : " + Math.toRadians(degree));
		
    }
}
