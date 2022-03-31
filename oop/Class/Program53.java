/**
 * Method Overloading - Operand Class
 */
package oop.Class;
class operands {
    int operand1;
    int operand2;
    
    public void set() {
        this.operand1 = 0;
        this.operand2 = 0;
    }

    public void set(int ope) {
        this.operand1 = ope;
        this.operand2 = ope;
    }

    public void set(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int getOperand1() {
        return this.operand1;
    }

    public int getOperand2() {
        return this.operand2;
    }

}
public class Program53 {
    public static void main(String[] args) {
        
        operands obj = new operands();

        obj.set();
        System.out.print("Operand1 : " + obj.getOperand1());
        System.out.println("\tOperand2 : " + obj.getOperand2());

        obj.set(24);
        System.out.print("Operand1 : " + obj.getOperand1());
        System.out.println("\tOperand2 : " + obj.getOperand2());

        obj.set(6, 24);
        System.out.print("Operand1 : " + obj.getOperand1());
        System.out.println("\tOperand2 : " + obj.getOperand2());
    }    
}
