public class GCD {
    static int findGCD(int m, int n) {
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(50, 25));
    }
}
