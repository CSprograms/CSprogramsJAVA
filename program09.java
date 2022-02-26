/**
 * Arithmetic Operations on integers
 */
import java.util.Scanner;
public class program09 {
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    
    System.out.print("Enter Input 1 : ");
    int ip1 = ip.nextInt();
    
    System.out.print("Enter Input 2 : ");
    int ip2 = ip.nextInt();
    
    ip.close();
    
    System.out.printf("%d + %d = %d%n", ip1, ip2, (ip1+ip2));
    System.out.printf("%d - %d = %d%n", ip1, ip2, (ip1-ip2));
    System.out.printf("%d * %d = %d%n", ip1, ip2, (ip1*ip2));
    System.out.printf("%d / %d = %d%n", ip1, ip2, (ip1/ip2));
    System.out.printf("%d %s %d = %d%n", ip1, "%", ip2, (ip1%ip2));
  }
}
