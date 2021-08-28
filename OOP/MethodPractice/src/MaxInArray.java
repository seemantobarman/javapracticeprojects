public class MaxInArray {
    static int maxOfArray(int[] A){
        int temp = 0;
        for(int i=0; i<=A.length-1; i++){
            if (A[i]>temp){
                temp = A[i];
            }
        }

        return temp;
    }
    public static void main(String[] args) {
        int[] elm = {1,10,5,6,9,23,6};
        System.out.println(maxOfArray(elm));
    }
}
