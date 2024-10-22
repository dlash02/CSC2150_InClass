package PrepRecur;

public class Recur2 {
    public static void main(String[] args) {
        System.out.printf("Sum1:%s", getSum( 5 ));
        System.out.printf("Sum1:%s", getSumRecur( 5 ));

    }
    private static int getSum(int n) {
        int sum = 0;
        for( int i=1; i<=n; i++ ) {
            sum += i;
        }
        return sum;
    }
    private static int getSumRecur(int n) {
        if ( n == 1 ) return 1;
        return n+getSumRecur(n-1);
    }

}
