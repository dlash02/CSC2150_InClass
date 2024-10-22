package PrepRecur;

public class Search {
    public static void main(String[] args) {
        int token = 16;
        int[] myList = { 2, 4, 6, 8, 10, 12, 14};
        boolean gotIt = linearSearch( myList, token);
        System.out.printf("\nLinear:%s counter:%s", gotIt, counter.ctr );
        counter.ctr = 0;

        int result  = binarySearch( myList, token);
        System.out.printf("\nBinary GoIt2:%s count:%s", result, counter.ctr );
    }
    private static boolean linearSearch(int[] myList, int token) {
        boolean gotIt = false;
        for ( int item : myList ){
            counter.ctr += 1;
            if ( item == token ){
                gotIt = true;
                break;
            }
        }
        return gotIt;
    }
    private static int  binarySearch(int[] myList, int key) {
        boolean gotIt = false;
        int low = 0;
        int high = myList.length - 1;
        int result = recursiveBinarySearch(myList, key, low, high);

        return result;
    }
    private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
        counter.ctr += 1;
        if (low > high) // The list has been exhausted without a match
            return -low - 1;

        int mid = (low + high) / 2;
        if (key < list[mid] )
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
                return mid;
        else
               return recursiveBinarySearch(list, key, mid + 1, high);

    }
    public class counter {
        public static int ctr = 0;
    }
}
