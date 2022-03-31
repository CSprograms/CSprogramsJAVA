 /**
* Positive or Negative -- Version 1
*/
package decision;
import java.util.Scanner;
public class program38{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter Input : ");
       int ip = input.nextInt(); 

       input.close();

       if( ip < 0) {
           System.out.println("Negative Number : " + ip);
       }
       else if (ip > 0) {
        System.out.println("Positive Number : " + ip);
       }
   }
}