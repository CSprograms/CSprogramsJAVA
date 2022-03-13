/**
 * Total and Average of 3 marks
 * Verifying the Mark Range 0 to 100 -- Version 1
 */
import java.util.Scanner;
public class program17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mark 1 : ");
        int m1 = input.nextInt();

        if(0 > m1 || 100 < m1) {
            System.out.print("Mark 1 is out of Range");
        }
        else {
            System.out.print("Enter Mark 2 : ");
            int m2 = input.nextInt();

            if(0 > m2 || 100 < m2) {
                System.out.print("Mark 2 is out of Range");
            }
            else {
                System.out.print("Enter Mark 3 : ");
                int m3 = input.nextInt();

                if(0 > m3 || 100 < m3) {
                    System.out.print("Mark 3 is out of Range");
                }
                else{
                    int total =m1 + m2 + m3;
                    float average = total / 3.0F;
                    
                    System.out.printf("Mark 1 : %d%nMark 2 : %d%nMark 3 : %d%n", m1, m2, m3);
                    System.out.printf("Total : %d%nAverage : %.2f", total, average);
                }
            }
        }
        input.close();
    }
}
