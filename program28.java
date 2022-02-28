/**
 * C(m.n) = m! / ( (m-n)! n! ) -- Version 1
 */
import java.util.Scanner;

public class program28 {    
    static int fact(int arg1) {

        int result = 1;

        for(int loopVariable = 1; loopVariable <= arg1; ++loopVariable) {
            result *= loopVariable;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for m : ");
        int m = input.nextInt();

        System.out.print("Enter the value for n : ");
        int n = input.nextInt();

        input.close();

        int mFact = fact(m);
        int nFact = fact(n);
        int mMinusNFact = fact(m-n);
        int combination = mFact / (mMinusNFact * nFact);

        System.out.print("Combination : " + combination);

    }

    
    
}
