package PrepRecur;

public class Recur1 {
    public static void main(String[] args) {
        System.out.printf("\n f1:%s", recur(5));
        System.out.printf("\n f2:%s", factRecur(5));
    }
    public static int recur( int n ){
        int fRet = 1;
        for( int i=1; i<=n; i++){
            fRet *= i;
        }
        return fRet;
    }
    public static int factRecur(int n) {
        if (n <= 1) // base case
            return 1;
        else
            return n*factRecur(n-1);
    }
}
