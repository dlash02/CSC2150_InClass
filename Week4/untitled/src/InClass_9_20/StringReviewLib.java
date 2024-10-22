package InClass_9_20;

import java.util.ArrayList;

public class StringReviewLib {
    private  String inString;

    public StringReviewLib(String inString) {
        this.inString = inString;
    }
    public String getInString() {
        return inString;
    }
    public void setInString(String inString) {
        this.inString = inString;
    }
    public String reverseString() {
        String retString = "";
        for (int i=inString.length()-1; i>=0; i--) {
            retString += inString.charAt(i);
        }
        return retString;
    }
    public Boolean gotThisChar( char inChar, StringBuilder inStr ) {
        Boolean gotThis = false;
        for (int i=0; i < inStr.length();  i++ ) {
            if ( inChar == inStr.charAt(i) )
                return true;
            }
        return   gotThis;
    }
    public int countOccurences( char c ) {
        int ct = 0;
        for( int i=0; i<inString.length(); i++ ) {
            if (inString.charAt(i) == c) {
                ct++;
            }
        }
        return ct;
    }
    public Boolean checkAllNumbers() {
        if ( inString.length() == 0 ) return false;
        for( int i=0; i<inString.length(); i++ ){
            if ( !isNumbericChar( inString.charAt(i)) ) {
               return false;
            }
        }
        return true;
    }
    public Boolean isNumbericChar( char inChar ){
        if ( inChar == '0' || inChar == '1' ||
             inChar == '2' || inChar == '3' ||
             inChar == '4' || inChar == '5' ||
             inChar == '6' || inChar == '7' ||
             inChar == '8' || inChar == '9' ) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isPalindrome() {
        // Example 1 "racecar"  returns true
        // example 2 "hannah" returns true
        // example 3 "Hannah" returns false (Capital H at start not match end char)
        int strLen = inString.length();
        for (int i = 0; i < inString.length() / 2; i++) {
            if (inString.charAt(i) != inString.charAt(strLen - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public  ArrayList<String> findAllSubstrings() {
        int n = inString.length();
        ArrayList<String> retList = new ArrayList<>();
        // Outer loop for the starting point of the substring
        for (int i = 0; i < n; i++) {
            // Inner loop for the endpoint of the substring
            for (int j = i + 1; j <= n; j++) {
                // Print the substring from index i to j-1
                retList.add(inString.substring(i, j));
                System.out.printf("\n %s", inString.substring(i, j));
            }
        }
        return retList;
    }
    // Method to check if str contains substr manually
    public boolean containsSubstring( String substr) {
        // For example  substr: ack  inString: Jackson
        // returns True
        // For example  substr: ak  inString: Jackson
        // returns False
        int n = inString.length();
        int m = substr.length();
        for (int i = 0; i <= n - m; i++) {
            if (inString.substring(i, i + m).equals(substr)) {
                return true;
            }
        }
        return false;
    }
    public boolean startsWithPrefix( String prefix) {
        // For example  prefex: Jack  inString: Jackson
        //   Returns: true
        // For example2  prefex: Jacka  inString: Jackson
        //   Returns false;
        int prefLen = prefix.length();
        if (prefLen > inString.length()) {
            return false;
        }
        if (inString.substring(0, prefLen).equals(prefix)) {
            System.out.printf("\n %s", inString.substring(0, prefLen));
            return true;
        } else {
            System.out.printf("\n ---->>> NO->%s", inString.substring(0, prefLen));

        }
//        for (int i = 0; i < n; i++) {
//            System.out.println("Comparing characters: " + inString.charAt(i) + " vs " + prefix.charAt(i));
//            if (inString.charAt(i) != prefix.charAt(i)) {
//                System.out.println("Mismatch found. The string does not start with the prefix.");
//                return false;
//            }
//        }
        return false;
    }
    public boolean isARotation( String checkString ) {
        // Given two strings, check if one is a rotation of the other.
        // Approach: Concatenate the first string with itself.
        // If the second string is a substring of this concatenated string, then it is a rotation.
        //        Example:`
        //        Input: str1 = "abcde", str2 = "cdeab"
        //        Output: true
        //          Both strings should have the same length
        if (inString.length() != checkString.length()) {
            return false;
        }
        // Concatenate str1 with itself
        String concatenatedStr = inString + inString;

        // Check if str2 is a substring of concatenatedStr
        return concatenatedStr.contains(checkString);
    }
    public int countEqualZeroOneSubstrings() {
        //Input: "00110"
        //Output:
        //Substrings with equal number of 0s and 1s:
        //"0011"
        //"01"
        //"10"
        //Total Count: 3
        int n = inString.length();
        int count = 0;

        // Outer loop to pick the start index of the substring
        for (int i = 0; i < n; i++) {
            int zeroCount = 0, oneCount = 0;
            // Inner loop to pick the end index of the substring
            for (int j = i; j < n; j++) {
                // Count the number of 0s and 1s
                if (inString.charAt(j) == '0') {
                    zeroCount++;
                } else if (inString.charAt(j) == '1') {
                    oneCount++;
                }
                // If the counts of 0s and 1s are equal, we found a valid substring
                if (zeroCount == oneCount) {
                    count++;
                    System.out.println("Equal 0s and 1s substring: " + inString.substring(i, j + 1));
                }
            }
        }
        return count;
    }
    public String findSmallestSubstring( int smallestSize) {
            // Method to find the lexicographically smallest substring of length k
            //            Example:
            //            Input: str = "bacd", smallestSize = 2
            //            Output: "ac"
            //            Input: str = "programming", smallestSize=4
            //            Output: "grame"
            //            why?
            //              The substrings of length 4 in "programming" are:
            //              "prog"
            //              "rogr"
            //              "ogra"
            //              "gram"
            //              "ramm"
            //              "ammi"
            //              "mmin"
            //              "ming"
            // The solution uses a sliding window
            int n = inString.length();
            // If the length of the string is less than smallestSize, return empty string
            if (n < smallestSize) {
                return "";
            }
            // Initialize the smallest substring as the first substring of length k
            String smallestSubstring = inString.substring(0, smallestSize);
            // Loop through all possible substrings of length k
            for (int i = 1; i <= n - smallestSize; i++) {
                String currentSubstring = inString.substring(i, i + smallestSize);
                // Compare lexicographically and update the smallestSubstring if necessary
                if (currentSubstring.compareTo(smallestSubstring) < 0) {
                    smallestSubstring = currentSubstring;
                }
            }
            return smallestSubstring;
        }
    // Method to count occurrences of a substring in a string
    public  int countOccurrences( String subStrToCheck) {
        //        Example:
        //        Input: inString = "ababab", substrToCheck = "ab"
        //        returns: 3
        //        Example2: inStr = "hellohellohello" subStringToCheck = "lo"
        //        returns 3;
        int count = 0;
        int fromIndex = 0;

        // Loop to find the substring within the main string
        while ((fromIndex = inString.indexOf(subStrToCheck, fromIndex)) != -1) {
            count++; // Increment count for each occurrence found
            fromIndex += subStrToCheck.length(); // Move index to avoid overlapping matches
        }
        return count;
    }
}

