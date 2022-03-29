/**
* Printing Odd and Even from 1 to N - Version 2
*/
import java.util.Scanner;
public class Program51{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter value for N : ");
       int n = input.nextInt(); 

       input.close();

       System.out.println("Odd Numbers:");
       for(int loop=1; loop<=n; loop += 2) {
           System.out.println(loop);
       }

       System.out.println("Even Numbers:");
       for(int loop=2; loop<=n; loop += 2) {
           System.out.println(loop);
       }
    }
}