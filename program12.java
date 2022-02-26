/**
 * Kilometer to Miles
 */
public class program12 {
  public static void main(String[] args){
    final double MILES_PER_KM = 0.621371;
    
    double kiloMeter = 3.2;
    double miles = kiloMeter * MILES_PER_KM;
    
    System.out.println("Kilometer : " + kiloMeter);
    System.out.print("Miles : " + miles);
  }
}