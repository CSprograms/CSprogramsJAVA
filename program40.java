 /**
* Square Root
*/
import java.util.Scanner;
public class program40{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter Input : ");
       int ip = input.nextInt(); 

       input.close();

       System.out.println("Square Root of " + ip + " is " + Math.sqrt(ip));
    }
}