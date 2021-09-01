//Creating a object of child class which inherits from parent class will cause the
//Constructor of the parent class to execute first then the child class's constructor will execute.

class Parent {
    public Parent(){
        System.out.println("Parent Class Constructor");
    }
}

class Child extends Parent {
    public Child(){
        System.out.println("Child Class Constructor");
    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
