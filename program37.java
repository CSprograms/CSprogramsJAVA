/**
 * Biggest amonng Three Numbers -- Version 3
 * Using Math.max(int,int)
 */
import java.util.Scanner;
public class program37{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Input 1 : ");
        int input1 = input.nextInt(); 

        System.out.print("Enter Input 2 : ");
        int input2 = input.nextInt();

        System.out.print("Enter Input 3 : ");
        int input3 = input.nextInt();
        input.close();

        int biggest = Math.max( Math.max(input1,input2), input3);
        
        System.out.println("Biggest Value : " + biggest);
    }
}
