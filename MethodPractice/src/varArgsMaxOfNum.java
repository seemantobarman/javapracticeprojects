public class varArgsMaxOfNum {
    static int max(int ...A){
        if (A.length==0){
            return 0;
        }else{
            int temp = 0;
            for (int i=0; i<=A.length-1; i++){
                if (A[i]>temp){
                    temp = A[i];
                }
            }

            return temp;
        }
    }
    public static void main(String[] args) {
        System.out.println(max(10,5,66,3,1));
    }
}
