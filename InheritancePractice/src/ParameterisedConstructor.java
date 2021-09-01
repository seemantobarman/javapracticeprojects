class Rectangle {
    int length, width;

    public Rectangle(){
        length = 1;
        width = 1;
    }

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }
}

class Cuboid extends Rectangle {
    int height;

    public Cuboid(){
        height = 1;
    }

    public Cuboid(int l, int w, int h){
        //By using super we are
        //Passing the 2 values to the parent class's constructor that take 2 arguments
        super(l,w);
        height = h;
    }

    public int volume(){
        return height * width * length;
    }
}

public class ParameterisedConstructor {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(1,4,5);
        System.out.println(c.volume());
    }
}
