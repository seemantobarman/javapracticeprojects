//Interface is a abstract method
//All the methods inside interface are abstract methods
//As like abstract classes we also can't create objects of interface class
//Abstract classes are extended and interfaces are implemented
//If we give a reference to an interface and create an object of a class i.e. Test t = new My() we can only call the method that are defined on the interface

interface Test {
    void method1();
    void method2();
}

class My implements Test {
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    public void method3(){
        System.out.println("Method 3");
    }
}

public class InterfaceExampleOne {
    public static void main(String[] args) {
        //By doing this we are able to call only the methods of Test interface
        Test t = new My();
        t.method1();
        t.method2();

        //By doing this we are able to call all the methods of My class
        My m = new My();
        m.method1();
        m.method2();
        m.method3();

    }
}
