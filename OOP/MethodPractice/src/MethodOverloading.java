//Method names are same but the params are different

public class MethodOverloading {
    static int max(int x, int y){
        return x>y?x:y;
    }

    static float max(float x, float y){
        return x>y?x:y;
    }

    static double max(double x, double y){
        return x>y?x:y;
    }

    public static void main(String[] args) {
        System.out.println(max(10.5f,65.3f));
    }
}
