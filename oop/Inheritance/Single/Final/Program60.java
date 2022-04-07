/**
 * Single Inheritance - Final Class - Compilation Error
 */
package oop.Inheritance.Single.Final;

final class Parent {

    public void display() {
        System.out.println("display() in Parent Class.");
    }
}

// error: cannot inherit from final Parent
class Child extends Parent {
    
	public void display() {
        System.out.println("display() in Child Class.");
    }
}
public class Program60 {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Child obj2 = new Child();

        Parent obj = obj1;
        System.out.println("Calling display() from parent class reference.");
        obj.display();

        obj = obj2;
        System.out.println("Calling display() from child class reference.");
        obj.display();
    }    
}