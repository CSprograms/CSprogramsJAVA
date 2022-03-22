/**
 * Miles Kilometer
 * 1mi = 1.609344km
 */
import java.util.Scanner; 
public class program30 {
  public static void main(String[] args){
	Scanner ip = new Scanner(System.in);  
    final double KM_PER_MILES = 1.609344;
    
	System.out.print("Enter the distance in Miles : ");
    double miles = ip.nextInt();
	
	ip.close();
	
    double kiloMeter = miles * KM_PER_MILES;
    
    System.out.println("Miles : " + miles);
    System.out.print("Kilometer : " + kiloMeter);
    
  }
}