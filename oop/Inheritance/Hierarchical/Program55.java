/**
 * Hierarchical Inheritance
 */
package oop.Inheritance.Hierarchical;
class inputs {

    int operand1;
    int operand2;
    
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
}

class Arithmetic extends inputs {
    
    private int sum;

    Arithmetic(){
        super();
    }

    Arithmetic(int ip1) {
        super(ip1);
    }

    Arithmetic(int ip1, int ip2) {
        super(ip1, ip2);
    }

    public void calculateArithmetic() {
        this.sum = super.getOperand1() + super.getOperand2();        
    }

    public void display() {
        System.out.println("Input 1 : " + super.getOperand1());
        System.out.println("Inpet 2 : " + super.getOperand2());
        System.out.println("Sum : " + sum);        
    }
}
public class Program55 {
    public static void main(String[] args) {
        
        Arithmetic obj1 = new Arithmetic();
        obj1.calculateArithmetic();
        obj1.display();

        Arithmetic obj2 = new Arithmetic(6);
        obj2.calculateArithmetic();
        obj2.display();

        Arithmetic obj3 = new Arithmetic(6, 24);
        obj3.calculateArithmetic();
        obj3.display();
    }    
}