/**
 * Abstract Class in Single Inheritance
 */
package oop.Inheritance.Single;

abstract class Operands {

    private int operand1;
    private int operand2;
    
    Operands(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int getOperand1() {
        return this.operand1;
    }

    public int getOperand2() {
        return this.operand2;
    }

    abstract public void calculateResult();
}

class Add extends Operands {
    
    private int sum;

    Add(int operand1, int operand2) {
        super(operand1, operand2);
    }

    public void calculateResult() {
        this.sum = super.getOperand1() + super.getOperand2();
    }

    public int getSum() {
        return this.sum;
    }    
}

public class Program58 {
    public static void main(String[] args) {

        Add obj = new Add(5, 6);
        obj.calculateResult();
        System.out.println("Addition : " + obj.getSum());
    }    
}