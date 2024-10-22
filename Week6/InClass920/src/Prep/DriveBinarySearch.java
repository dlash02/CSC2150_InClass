package Prep;

import java.util.ArrayList;
import java.util.Arrays;

public class DriveBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(
                (Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
        ));
        int tok=6;
        int ret = bSearch(myList, tok);
        System.out.printf("\n Res:%s", ret);
    }
    private static int bSearch(ArrayList<Integer> myList, int tok) {
        int low = 0;
        int high = myList.size() - 1;
        int ct = 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if ( tok ==  myList.get(middle)){
                System.out.printf("return mid:%s", ct);
                return middle;
            }
            if (myList.get(middle) < tok ) {
                System.out.printf("\n go right:%s", ct);
                low = middle + 1;
            } else  {  //if (myList.get(middle) > tok)
                System.out.printf("\n go left:%s", ct);
                high = middle - 1;
            }
            ct++;
        }
        System.out.printf("\n ret not found:%s", ct);
        return -1;
    }
}
