public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int nTimes = 10000;

        singleLoop( nTimes );

        otherLoop( nTimes);

        doConstantWork( nTimes );

        doThisWork( nTimes );

        thisCouldBeTrouble( nTimes );

    }

    private static void thisCouldBeTrouble(int nTimes) {
        int sum = 0;
        for (int i = 0; i < nTimes; i++) {
//            sum += hereIsAMethod( nTimes );
        }
        sum = hereIsAMethod( nTimes );
    }

    private static int hereIsAMethod(int nTimes) {
        int sum = 0;
        for (int i = 0; i < nTimes; i++) {
            sum+= i;
        }
        return sum;
    }

    private static void doThisWork(int nTimes) {
        int i = nTimes;
        for( int j = 0; j< nTimes; j++) {
            while (i > 10) {
                i /= 2;
            }
        }
    }

    private static void doConstantWork(int nTimes) {
        nTimes += 10;
        int n=100;
        for( int i=0; i<10000; i++ ){
            nTimes += n;
        }
        if ( nTimes %2 == 1 ){
            System.out.println( nTimes );
        }
    }

    private static void otherLoop(int nTimes) {
        int x = 0;
        for (int i = 0; i < nTimes; i++) {
            for ( int j=0; i<nTimes; j++ ) {
                if ( j > 1000000 ) {
                    x += i + j;
                }
            }
        }
    }

    private static int singleLoop(int nTimes) {
        int sum = 0;
        int x = 100;
        sum += x;
        x = x + 1;
        sum += x;
        for( int i = 0; i < nTimes; i++ ) {
            sum += i;
//            i = i * i;
        }
        for( int i = 0; i < nTimes; i++ ) {
            sum += i;
//            i = i * i;
        }
        return sum;
    }
}