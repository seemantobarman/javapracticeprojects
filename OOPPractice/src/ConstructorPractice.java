class Rectangle_Class{
    private double length;
    private double width;

    //Any type of validation can be done in the setter methods
    //Getter and Setter are also called as property methods
    private void setLength(double l) {
        length = l;
    }

    private void setWidth(double w) {
        width = w;
    }

    //Constructor
    public Rectangle_Class(){
        setLength(1);
        setWidth(1);
    }

    public Rectangle_Class(double l, double w){
        setLength(l);
        setWidth(w);
    }

    public double area(){
        return length * width;
    }
}

public class ConstructorPractice {
    public static void main(String[] args) {
        Rectangle_Class r1 = new Rectangle_Class(10,10);
        System.out.println(r1.area());
    }
}
