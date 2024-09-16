import java.util.ArrayList;

public class Inclass_9_13  {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(150);
        list.add( 99 );
        list.add( 100 );
        list.add( 101 );
        list.add( 102 );
        list.add( 103 );
        list.add( 104 );
        list.add( 105 );
        System.out.printf("\n Item1:%s totalItems:%s",
                list.get(0), list.size());
        list.set(0, 1000);
        System.out.printf("\n Item1:%s totalItems:%s",
                list.get(0), list.size());
        list.remove(1);
        System.out.printf("\n Item1:%s totalItems:%s",
                list.get(0), list.size());
        ArrayList<Double> listDouble = new ArrayList<>();
        ArrayList<String> listShopping = new ArrayList<>();
        ArrayList<Character> listChar = new ArrayList<>();
        ArrayList<Boolean> listB = new ArrayList<>();
        for( int i = 0; i < list.size(); i++ ) {
            System.out.printf("\nItem:%s is:%s", i, list.get(i));
        }
        showTheList( list );
    }
    private static void showTheList(ArrayList<Integer> list) {
        for( int item : list ) {
            System.out.printf("\n item:%s", item);
        }
    }
}
