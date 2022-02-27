/**
 * Biggest amonng N Numbers using Array
 */
import java.util.Scanner;
 public class program23 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the Number of elements (size) : ");
         int size = input.nextInt();
         int[] array = new int[size];

         for(int loopVariable=0; loopVariable < size; ++loopVariable) {
             System.out.printf("Enter value for Array[%d] : ", loopVariable);
             array[loopVariable] = input.nextInt();
         }

         input.close();

         int biggest = array[0];

         for(int temp : array) {
             if( temp > biggest) {
                 biggest = temp;
             }
         }

         System.out.print("Biggest Value : " + biggest);
     }
}
