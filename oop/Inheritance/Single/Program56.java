/**
 * Single Inheritance - Overriding Method
 */
package oop.Inheritance.Single;

class Parent {

    Parent() {
        System.out.println("\nThis is Parent Class Constructor.");
    }

    public void display() {
        System.out.println("\nDisplay Method in Parent Class.");
    }

}

class Child extends Parent {
    
    Child() {
        super();
        System.out.println("\nThis is Child Class Constructor.");
    }

    public void display() {
        System.out.println("\nDisplay Method in Child Class.");
    }

    public void Overriding() {
        System.out.println("\nCalling Child Class Display Method.");
        this.display();

        System.out.println("\nCalling Parent Class Display Method.");
        super.display();
    }

}
public class Program56 {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.display();

        obj.Overriding();
    }    
}