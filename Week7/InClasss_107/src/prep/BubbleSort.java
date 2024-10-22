package prep;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = { 64, 55, 12, 66, 91, 21, 121, 12, 33};
        int sLis[] = bubbleSort( arr );
        System.out.printf("\n Results are .... ");
        for ( int item : sLis) {
            System.out.printf("\n Item:%s", item);
        }
    }

    private static int[] bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i=0; i<n-1; i++ ){
            // grab the left most item and move compare it.
            for (int j=0; j<n-i-1; j++ ){
                if ( arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
