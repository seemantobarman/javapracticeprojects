class Circle {
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends Circle {
    //...All the codes of Circle Class is present here when extending
    public double height;

    public double volume(){
        return area()*height;
    }
}

public class CircleInheritance {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.height = 10;
        c.radius = 7;
        System.out.println("Volume: "+c.volume());
        System.out.println("Area: "+c.area());
    }
}
