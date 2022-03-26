 /**
* Cubic Root
*/
import java.util.Scanner;
public class program41{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter Input : ");
       int ip = input.nextInt(); 

       input.close();

       System.out.println("Cubic Root of " + ip + " is " + Math.cbrt(ip));
    }
}