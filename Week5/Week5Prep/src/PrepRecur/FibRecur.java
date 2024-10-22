package PrepRecur;
public class FibRecur {
    public static void main(String[] args) {
        long i2=5;
        System.out.printf( "\nfib Recursion at pos:%s rec:%s", i2, fibRec(i2) );
        System.out.printf( "\nno rec at rec:%s: %s", i2, fibNoRecusion(i2) );
    }
    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
    private static long fibRec(long num) {
        if ( num == 0  || num == 1){
            return num;
        }
       return fibRec(num-1) + fibRec( num - 2);
    }
    private static int fibNoRecusion(long num) {
        System.out.printf("\n Fib Series for term:%S", num);
        int term_1 = 0;
        int term_2 = 1;
        int term_3 =0;
        for (int i = 1; i <= num; ++i) {
            System.out.printf("%s ", term_1);
            term_3 = term_1 + term_2;
            term_1 = term_2;
            term_2 = term_3;
        }
        return term_1;
    }
}
