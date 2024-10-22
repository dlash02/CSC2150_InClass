public class Sampler1 {
    public static void main(String[] args) {
        int x = 4;
        int[] myNumbs = { 2, 3, 4, 5, 6, 1};
        int n = getThisValue( myNumbs, 3 );
        System.out.println( n );
    }

    private static int getThisValue(int[]  inNum, int y ) {
        int ret = 0;
        for( int i=y; i<inNum.length; i++ ) {
            ret += inNum[i];
        }
        return ret;
    }
}
