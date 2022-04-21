/**
 * Interface
 */
package oop.Interface;

interface inputs {

    static int operand1=0;
    static int operand2=0;
    
    public int getOperand1();
    public int getOperand2();
}

class Addition implements inputs {
    
    private int sum;

    public void calculateAddition() {
        this.sum = getOperand1() + getOperand2();        
    }

    public void display() {
        System.out.println("Input 1 : " + getOperand1());
        System.out.println("Input 2 : " + getOperand2());
        System.out.println("Sum : " + sum);        
    }

    @Override
    public int getOperand1() {
        return inputs.operand1;
    }

    @Override
    public int getOperand2() {
        return inputs.operand2;
    }
}
public class Program62 {
    public static void main(String[] args) {
        
    }    
}