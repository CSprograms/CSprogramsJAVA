/**
* C(m.n) = m! / ( (m-n)! n! ) -- Version 2
*/
import java.util.Scanner;
class factorial {
   static int fact(int arg1) {

       int result = 1;

       for(int loopVariable = 1; loopVariable <= arg1; ++loopVariable) {
           result *= loopVariable;
       }

       return result;
   }
}

public class program29 {    
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value for m : ");
       int m = input.nextInt();

       System.out.print("Enter the value for n : ");
       int n = input.nextInt();

       input.close();

       int mFact = factorial.fact(m);
       int nFact = factorial.fact(n);
       int mMinusNFact = factorial.fact(m-n);
       int combination = mFact / (mMinusNFact * nFact);

       System.out.print("Combination : " + combination);
   }  
   
}