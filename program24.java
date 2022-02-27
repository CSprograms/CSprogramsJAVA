/**
 * Biggest amonng N Numbers without using Array
 */
import java.util.Scanner;
 public class program24 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the Number of elements (size) : ");
         int size = input.nextInt();

         System.out.print("Enter the First value : ");
         int biggest = input.nextInt();
         --size;

         int temp;
         while(size > 0) {
             System.out.print("Enter the next value : ");
             temp = input.nextInt();
             --size;
             if( temp > biggest) {
                 biggest = temp;                 
             }
         }

         input.close();

         System.out.print("Biggest Value : " + biggest);
     }
}
