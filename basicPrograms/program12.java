/**
 * Kilometer to Miles
 * 1km = 0.6213711922mi
 */
package basicPrograms;
 import java.util.Scanner; 
public class program12 {
  public static void main(String[] args){
	Scanner ip = new Scanner(System.in);  
    final double MILES_PER_KM = 0.6213711922;
    
	System.out.print("Enter the distance in km : ");
    double kiloMeter = ip.nextInt();
	
	ip.close();
	
    double miles = kiloMeter * MILES_PER_KM;
    
    System.out.println("Kilometer : " + kiloMeter);
    System.out.print("Miles : " + miles);
  }
}