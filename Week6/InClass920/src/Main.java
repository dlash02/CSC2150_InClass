public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] myList = { 2, 4, 6, 8, 10, 12, 14, 16};
        int tok = 16;
        boolean gotIt = gotThisNumber( myList, tok );
        System.out.printf("Got Numb:%s is %s", tok, gotIt);
//        i
//        nt n = 100;
//        int retVal = areULoopy( n );
    }

    private static int areULoopy(int n) {
        int ret = 0;
        if( n == 12 ) n++;
        if( n == 12 ) n++;
        if( n == 12 ) n++;
        if( n == 12 ) n++;
        if( n == 12 ) n++;
        if( n == 12 ) n++;
        if( n == 12 ) n++;
        for ( int i = 0; i < n; i++ ) {
            for( int j = 0; j < n; j++ ) {
                if ( j > 1000 ) break;
                ret += 1;
            }
        }
        return ret;
    }

    private static boolean gotThisNumber(int[] myList, int tok) {
        boolean gotIt = false;
        for( int i = 0; i < myList.length; i++ ) {
            if( tok == myList[i]){
                gotIt = true;
                break;
            }
        }
        return gotIt;
    }
}