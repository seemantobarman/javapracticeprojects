public class varArgsSumOfNums {
    static int sum(int ...A){
        if(A.length==0){
            return 0;
        }
        int temp = 0;
        for(int i=0; i<=A.length-1; i++){
            temp = temp+A[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
    }
}
