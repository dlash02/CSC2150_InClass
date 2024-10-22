public class InsertionSort {
	public static void main(String[] args) {
		int[] myList = {2, 9, 5, 4, 8, 1, 6};
		int[] myNewList = insertionSort( myList );
		dumpItOut( myNewList );
	}
  /** The method for sorting the numbers */
  public static int[] insertionSort(int[] list) {
    for (int i = 1; i < list.length; i++) {
      /** insert list[i] into a sorted sublist list[0..i-1] so that
           list[0..i] is sorted. */
      int currentElement = list[i];
      int k;
      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
    	System.out.printf("\n --- moving i:%d k:%d listK:%d into listk+1:%d", i, k, list[k+1], list[k]);
        list[k + 1] = list[k];
      }
      int STOP = 3;
//      if ( i == STOP ) {
//    	  System.out.printf("\n --- i:%d done", i);
//    	  dumpItOut( list );
//    	//  System.exit(1);
//      }
      // Insert the current element into list[k+1]
      list[k + 1] = currentElement;
//      if ( i == STOP ) {
//    	  System.out.printf("\n --- put in current item i:%d done", i);
//    	  dumpItOut( list );
//    	  System.exit(1);
//      }
    }
    return list;
  }
  public static void dumpItOut( int[] myList ) {
	    int ct = 0;
		for( int i: myList ){
			System.out.printf("\nct:%d i:%d", ct, i);
			ct++;
		}
  }
}
