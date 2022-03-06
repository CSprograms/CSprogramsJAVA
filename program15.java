/**
 * Body Mass Index (BMI) = Weight / Height^2
 * Weight in KiloGram
 * Height in Meter
 */
import java.util.Scanner;
public class program15 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        final double METER_PER_FOOT = 0.3046;

        System.out.print("Enter the Weight : ");
        double weight = ip.nextDouble();

        System.out.print("Enter the Height : ");
        double heightInFeet = ip.nextDouble();

        ip.close();

        double height = heightInFeet * METER_PER_FOOT;

        System.out.println("Weight : " + weight);
        System.out.println("Height : " + height);
        System.out.println("BMI : " + Math.round(weight / Math.pow(height,2) ) );
    }
}