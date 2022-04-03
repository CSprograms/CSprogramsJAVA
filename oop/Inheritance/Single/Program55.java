/**
 * Single Inheritance - Method Overriding
 */
package oop.Inheritance.Single;

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
public class Program55 {
    public static void main(String[] args) {
        
        Addition obj1 = new Addition();
        obj1.calculateAddition();
        obj1.display();

        Addition obj2 = new Addition(6);
        obj2.calculateAddition();
        obj2.display();

        Addition obj3 = new Addition(6, 24);
        obj3.calculateAddition();
        obj3.display();
    }    
}