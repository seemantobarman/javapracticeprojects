//This is the parent class
class Super {
    public void display(){
        System.out.println("I'm From Super Class");
    }
}

//This is the child class which extends Parent Class
//Sub Class's method display() is same as Parent Class's display() method
//To Override the parent class's method we can use the @Override
class Sub extends Super {
    @Override
    public void display(){
        System.out.println("I'm from Sub Class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Super su = new Super();
        su.display();

        Sub sub = new Sub();
        sub.display();
    }
}
