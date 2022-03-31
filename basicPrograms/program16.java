/**
 * Total and Average of 3 marks
 */
package basicPrograms;
import java.util.Scanner;
public class program16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mark 1 : ");
        int m1 = input.nextInt();

        System.out.print("Enter Mark 2 : ");
        int m2 = input.nextInt();

        System.out.print("Enter Mark 3 : ");
        int m3 = input.nextInt();

        input.close();

        int total =m1 + m2 + m3;

        float average = total / 3.0F;
        
        System.out.printf("Mark 1 : %d%nMark 2 : %d%nMark 3 : %d%n", m1, m2, m3);
        System.out.printf("Total : %d%nAverage : %.2f", total, average);
        
    }
}
