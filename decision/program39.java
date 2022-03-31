 /**
* Positive or Negative -- Version 2
*/
package decision;
import java.util.Scanner;
public class program39{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter Input : ");
       int ip = input.nextInt(); 

       input.close();

       int temp = ip + Math.abs(ip);

       if( temp ==0 ) {
           System.out.println("Negative Number : " + ip);
       }
       else {
        System.out.println("Positive Number : " + ip);
       }
   }
}