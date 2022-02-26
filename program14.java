/**
 * Body Mass Index (BMI)
 */
public class program14 {
    public static void main(String[] args) {
        final double KG_PER_POUND = 0.454;
        final double METER_PER_FOOT = 0.3046;

        double weightInPound = 68.3;
        double heightInFeet = 5.4;

        double weight = weightInPound * KG_PER_POUND; 
        double height = heightInFeet * METER_PER_FOOT;

        System.out.println("Weight : " + weight);
        System.out.println("Height : " + height);
        System.out.println("BMI : " + Math.round(weight / (height * height)));
    }
}