 /**
* Printing Odd and Even from 1 to N - Version 1
*/
package iteration;
import java.util.Scanner;
public class Program50{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter value for N : ");
       int n = input.nextInt(); 

       input.close();

       System.out.println("Odd Numbers:");
       for(int loop=1; loop<=n; loop++) {
           if ( loop%2 == 0 ) continue;
           System.out.println(loop);
       }

       System.out.println("Even Numbers:");
       for(int loop=1; loop<=n; loop++) {
           if ( loop%2 == 1 ) continue;
           System.out.println(loop);
       }
    }
}
