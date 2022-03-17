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

		double radian = degree * Math.PI /180;

		System.out.println("Degree Value : " + degree);
        System.out.println("Radian Value (Manual Calculation) : " + radian);
        System.out.print("Radian Value (Buil-in Method) : " + Math.toRadians(degree));
		
    }
}
