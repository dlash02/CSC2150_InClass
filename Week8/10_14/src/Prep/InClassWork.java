package Prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class InClassWork {
    public static void main(String[] args) {
        String inputString  = getInputStrings();
        HashMap< String, Integer> resultsCt = countWordOccurences( inputString);
        showResults( resultsCt );

        // ToDo: Change the definition of the datastructure from:
        // HashMap<String, Integer> resultsCt = new HashMap<>();
        // to
        //TreeMap<String, Integer> resultsCt = countWordOccurences( inputString);
        // Also try
       //         LinkedHashMap<String Integer> resultsCt = countWordOccurences()

    }

    private static void showResults(HashMap<String, Integer> resultsCt) {
        // ToDo: Show the output of the HashMap

    }

    private static HashMap<String, Integer> countWordOccurences(String inputString) {
        // ToDo: Write this method that counts the occurences of words
        // For example, for the string "apple banana apple orange banana apple"
        // Return a hashmap with
        //apple: 3
        //banana: 2
        //orange: 1
        // Special bouns 1, convert all words to lowercase so that "Apple" and "apple" are counted as the same work
        // Special bouns 2, remove any punctionation so that owls. and owls and you! and you are counted as the same words
        HashMap<String, Integer> resultsCt = new HashMap<>();
        String[] tokens = inputString.split("\\s+");
        return resultsCt;

    }

    private static String getInputStrings() {
        String inString = "apple banana apple orange banana apple";
////            String inString = "Far over the misty mountains cold, to dungeons deep and caverns old, the hobbits went with hearts so bold. " +
//                    "Frodo, Sam, Merry, and Pippin marched through the forests dark and untamed, guided only by the glimmer of moonlight" +
//                    "  and the distant hum of ancient songs. Along the way, they crossed rivers swift and fields wide, encountering " +
//                    " mischievous squirrels and wise old owls. Their packs were light, but their spirits were high, for they knew that" +
//                    "adventure awaited. Yet, with every step closer to Mordor, the weight of the One Ring grew heavier, and Frodo’s heart began to waver. " +
//                    "But Samwise stood firm, saying, 'Come, Mr. Frodo, I can’t carry the ring for you, but I can carry you!'" +
//                    " And with that, the two friends pressed on, determined to see their quest through.";
            return inString;
    }
}
