/**
 * Hierarchical Inheritance
 */
package oop.Inheritance.Hierarchical;

class inputs {

    private int operand1;
    private int operand2;
    
    inputs() {
        this.operand1 = 0;
        this.operand2 = 0;
    }

    inputs(int ope) {
        this.operand1 = ope;
        this.operand2 = ope;
    }

    inputs(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int getOperand1() {
        return this.operand1;
    }

    public int getOperand2() {
        return this.operand2;
    }

    public void display() {
        System.out.println("Input 1 : " + getOperand1());
        System.out.println("Input 2 : " + getOperand2());
    }
}

class Addition extends inputs {
    
    private int sum;

    Addition(){
        super();
    }

    Addition(int ip1) {
        super(ip1);
    }

    Addition(int ip1, int ip2) {
        super(ip1, ip2);
    }

    public void calculateAddition() {
        this.sum = super.getOperand1() + super.getOperand2();        
    }

    public void display() {
        super.display();
        System.out.println("Sum : " + sum);        
    }
}

class Subtraction extends inputs {
    
    private int difference;

    Subtraction(){
        super();
    }

    Subtraction(int ip1) {
        super(ip1);
    }

    Subtraction(int ip1, int ip2) {
        super(ip1, ip2);
    }

    public void calculateSubtraction() {
        this.difference = super.getOperand1() - super.getOperand2();        
    }

    public void display() {
        super.display();
        System.out.println("Difference : " + this.difference);        
    }
}

public class Program56 {
    public static void main(String[] args) {
        
        Addition obj1 = new Addition(6);
        obj1.calculateAddition();
        obj1.display();

        Subtraction obj2 = new Subtraction(6, 24);
        obj2.calculateSubtraction();
        obj2.display();
    }    
}