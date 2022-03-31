/**
 * Operand Class
 */
package oop.Class;
class operand{
    int operand1;
    
    public void set(int ope) {
        this.operand1 = ope;
    }
    
    public int getOperand1() {
        return this.operand1;
    }
}
public class Program52 {
    public static void main(String[] args) {
        
        operand obj = new operand();

        obj.set(24);
        System.out.print("Operand1 : " + obj.getOperand1());        
        
    }    
}
