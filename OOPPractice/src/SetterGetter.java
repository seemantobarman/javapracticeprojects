class Rectangle{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
        if (l>=0){
            length = l;
        }else{
            length = 0;
        }

    }

    public void setBreadth(double b){
        if (b>=0){
            breadth = b;
        }else{
            breadth = 0;
        }

    }

    public double area(){
        return length * breadth;
    }
}
public class SetterGetter {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(7);
        r1.setBreadth(5.7);
        System.out.println("Area--> "+r1.area());
        System.out.println("Length-->" +r1.getLength());
        System.out.println("Breadth--> "+r1.getBreadth());
    }
}
