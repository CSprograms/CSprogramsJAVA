/**
 * Single Inheritance - Method Overriding - Runtime Polymorphism
 */
package oop.Inheritance.Single;

class Parent {

    public void display() {
        System.out.println("display() in Parent Class.");
    }
}

class Child extends Parent {
    
    public void display() {
        System.out.println("display() in Child Class.");
    }
}
public class Program57 {
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