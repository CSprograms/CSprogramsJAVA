/**
 * Arithmetic Operations on double
 */
import java.util.Scanner;
public class program10 {
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    
    System.out.print("Enter Input 1 : ");
    double ip1 = ip.nextDouble();
    
    System.out.print("Enter Input 2 : ");
    double ip2 = ip.nextDouble();
    
    ip.close();
    
    System.out.printf("%.4f + %.4f = %.4f%n", ip1, ip2, (ip1+ip2));
    System.out.printf("%.4f - %.4f = %.4f%n", ip1, ip2, (ip1-ip2));
    System.out.printf("%.4f * %.4f = %.4f%n", ip1, ip2, (ip1*ip2));
    System.out.printf("%.4f / %.4f = %.4f%n", ip1, ip2, (ip1/ip2));
    System.out.printf("%.4f %s %.4f = %.4f%n", ip1, "%", ip2, (ip1%ip2));
  }
}
