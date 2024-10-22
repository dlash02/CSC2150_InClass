import java.util.ArrayList;
import java.util.HashMap;

public class HashesAreCool {
    public static void main(String[] args) {
        ArrayList<String> myList = pretendToGetDataFromFile();
        HashMap<String,Integer> listCounts = new HashMap<>();
        for( String item : myList){
            if ( listCounts.containsKey(item)){
                int oldCount = listCounts.get(item);
                listCounts.put(item,oldCount+1);
            } else {
                listCounts.put(item,1);
            }
        }
        showTheResults( listCounts);
    }

    private static void showTheResults(HashMap<String, Integer> listCounts) {
        for( String key : listCounts.keySet()){
            System.out.printf("\n%s: %d\n", key, listCounts.get(key));
        }
    }

    private static ArrayList<String> pretendToGetDataFromFile() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Apple");
        myList.add("Baker");
        myList.add("Baker");
        myList.add("Baker");
        myList.add("Baker");
        myList.add("Charlie");
        return myList;
    }
}
