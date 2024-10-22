package InClass_9_23;

public class Recur1 {
    public static void main(String[] args) {
        // sum all numbers up to 'n'
        // e.g., 1+2+3+4+5
        int n = 5;
        int sum = getSumNumbers( n );
        System.out.printf("\n sum:%s", sum);
        int sum2 = getSumNumbersRecur( n );
        System.out.printf("\n sum2:%s", sum2);

    }

    private static int getSumNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    private static int getSumNumbersRecur(int n) {
        if ( n == 1 ){
            return 1;
        }
        return n+getSumNumbersRecur(n-1);
    }
}
