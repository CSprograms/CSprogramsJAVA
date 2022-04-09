/**
 * Multi-Level Inheritance
 */
package oop.Inheritance.Multilevel;

class inputs {

    private int operand1;
    private int operand2;
    
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

class Addition extends inputs {
    
    private int sum;

    Addition(int ip1, int ip2) {
        super(ip1, ip2);
    }

    public void calculateAddition() {
        this.sum = super.getOperand1() + super.getOperand2();        
    }
    
    public int getSum() {
        return this.sum;
    }
}

class Square extends Addition {

    private int square;

    Square(int ip1, int ip2) {
        super(ip1, ip2);
    }

    public void calculateSquare() {
        int sum = super.getSum();
        this.square = sum * sum;
    }
    
    public int getSquare() {
        return this.square;
    }

}

public class Program61 {
    public static void main(String[] args) {
        
        Square obj = new Square(2, 3);
        obj.calculateAddition();
        obj.calculateSquare();
        
        System.out.println("Operand1  : " + obj.getOperand1());
        System.out.println("Operand2  : " + obj.getOperand2());
        System.out.println("Operand1 + Operand2 : " + obj.getSum());
        System.out.println("(Operand1 + Operand2)^2 : " + obj.getSquare());
    }    
}