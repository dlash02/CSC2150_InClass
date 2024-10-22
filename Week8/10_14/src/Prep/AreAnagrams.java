package Prep;
import java.util.HashMap;
class AreAnagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1, s2)) {
            System.out.printf("\n Yes %s and %s are anagrams\n", s1, s2);
        } else {
            System.out.printf("\n No %s and %s are NOT anagrams\n", s1, s2);
        }
    }
    public static boolean areAnagrams(String s1, String s2) {
        // If the lengths are not equal, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        // Create a HashMap to count character frequencies for the first string
        HashMap<Character, Integer> charCount = new HashMap<>();
        // Populate the map with characters from the first string
        for (char c : s1.toCharArray()) {
            if ( charCount.containsKey(c) ) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
//            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // Decrease the frequency of characters from the second string
        for (char c : s2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // If a character in s2 isn't in s1
            }
            charCount.put(c, charCount.get(c) - 1);
            // If the frequency becomes 0, remove the character from the map
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }
        // If the map is empty, the two strings are anagrams
        return charCount.isEmpty();
    }
}

