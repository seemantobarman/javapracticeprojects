//All the classes we use are concrete classes
// We can't create object of an abstract class
//Abstract methods can't have any body
//Abstract classes are only used for inheritance
//We must override the abstract methods to use them

abstract class Super{
    public Super(){
        System.out.println("Constructor of super class");
    }

    public void meth1(){
        System.out.println("Meth1 method of super class");
    }

    abstract public void meth2();
}

class Sub extends Super {
    @Override
    public void meth2(){
        System.out.println("Method 2");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
       Sub su = new Sub();
       su.meth1();
       su.meth2();
    }
}
