import java.util.ArrayList;
import java.util.Arrays;

public class InClass_BS_10_2 {
    public static void main(String[] args) {
        int tok = 21;
        ArrayList<Integer> myList = new ArrayList<>(
                (Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
        ));
        int ret =  bSearch( myList, tok);
        System.out.printf( "\n tok:%s ret:%s", tok, ret );
    }

    private static int bSearch(ArrayList<Integer> myList, int tok) {
        int low = 0;
        int high = myList.size() - 1;
        int ct = 1;

        while ( low <= high ) {
            int mid = (low + high) / 2;
            if ( myList.get(mid) == tok ) {
                System.out.printf("\n Return mid:%s", mid);
                return mid;
            }
            if ( myList.get(mid)  < tok ) {
                System.out.printf("\n Go to right mid:%s ct:%s", mid, ct);
                low = mid + 1;
            } else {
                high = mid - 1;
                System.out.printf("\n Go to left mid:%s ct:%s hi:%s low:%s",
                        mid, ct, high,low);
            }
            ct++;
        }
        System.out.printf("\n Returning not found:%s", ct);
        return -1;

    }
}
