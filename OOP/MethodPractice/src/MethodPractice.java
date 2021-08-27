import java.util.Arrays;

public class MethodPractice {
    static void change(int Arr[],int index, int value) {
        Arr[index] = value;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,5,6,7};
        System.out.println("Before Changing: ");
        System.out.println(Arrays.toString(A));
        change(A,0,10);
        System.out.println("After Changing: ");
        System.out.println(Arrays.toString(A));
    }
}