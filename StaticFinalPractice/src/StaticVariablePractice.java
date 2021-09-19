class Test {
    //Static variables are same across all the created objects of this class
    //Changing the static variable through one instance will change it for every instance
    static int x = 10;
    int y = 20;

    //Non static methods can access the static variables
    void show(){
        System.out.println(x+" "+y);
    }

    //Static methods can only access static variables
    static void display (){
        System.out.println(x);
    }
}

public class StaticVariablePractice {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
        t1.x = 50;
        t1.y = 33;

        Test t2 = new Test();
        t2.show();

        Test t3 = new Test();
        t3.show();

        Test t4 = new Test();
        t4.show();

    }
}