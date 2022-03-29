 /**
* Printing from 1 to N
*/
import java.util.Scanner;
public class Program49{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter value for N : ");
       int n = input.nextInt(); 

       input.close();

       for(int loop=1; loop<=n; loop++) {
        System.out.println(loop);
       }       
    }
}