package PrepRecur;

import java.util.ArrayList;
import java.util.Arrays;

public class InClassSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbs = new ArrayList<>(
                Arrays.asList( 5, 10, 15, 20 )
        );
        int sum = 0;
        int spot = numbs.size();
        sum = getSum( numbs, sum, spot-1 );
        System.out.printf("sum:%s", sum);
    }

    private static int getSum(ArrayList<Integer> numbs, int sum, int pos) {
        // Using recursion
        if ( pos < 0){
            return sum;
        } else {
            sum += numbs.get(pos);
            return getSum( numbs, sum, pos -1 );
        }
    }
}
