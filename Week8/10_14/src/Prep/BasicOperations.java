package Prep;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class BasicOperations {
        public static void main(String[] args) {
//            TreeMap<String, Integer> studentScores = new TreeMap<>();
//            HashMap<String, Integer> studentScores = new HashMap<>();
            LinkedHashMap<String, Integer> studentScores = new LinkedHashMap<>();


            // 2. Add key-value pairs using put()
            studentScores.put("Xavier", 85);
            studentScores.put("Charlie", 78);
            studentScores.put("Diana", 88);
            studentScores.put("Bob", 92);
            studentScores.put("Augusta", 92);


            // 3. Retrieve a value using get()
            System.out.println("Bob's Score: " + studentScores.get("Bob")); // 92

            // 4. Check if a key exists using containsKey()
            if (studentScores.containsKey("Charlie")) {
                System.out.println("Charlie's score is recorded.");
            } else {
                System.out.println("No score found for Charlie.");
            }

            // 5. Loop through the TreeMap and print all entries (keys and values)
            System.out.println("\nAll Student Scores:");
            for (String key : studentScores.keySet()) {
                System.out.println(key + ": " + studentScores.get(key));
            }

            // 6. Bonus: Loop using entrySet() for cleaner access to both key and value
            System.out.println("\nUsing entrySet():");
            for (var entry : studentScores.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }