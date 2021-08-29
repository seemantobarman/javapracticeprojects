class CircleArea {
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
}

public class Circle {
    public static void main(String[] args) {
        CircleArea c1 = new CircleArea();
        c1.radius = 10;
        System.out.println(c1.area());

        CircleArea c2 = new CircleArea();
        c2.radius = 7;
        System.out.println(c2.area());
    }
}
