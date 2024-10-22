package InClass_9_23;


public class RecurPalin {
    public static void main(String[] args) {
        String inString = "racecar";
        if ( isPalin( inString )){
            System.out.printf("Yes inString:%s is a palindrome", inString);
        } else {
            System.out.printf("No inString:%s is a no palindrome", inString);
        }
    }

    private static boolean isPalin(String inString) {
        int check = inString.length() -1;
        int done  = inString.length()/2;
        for ( int i=0; i<done; i++){
            if ( inString.charAt(i) != inString.charAt(check)){
                return false;
            }
            check -= 1;
        }
        return true;
    }
    private static boolean isPalinV2(String inString) {
        int check = inString.length() -1;
        int done = inString.length()/2;
        for( int i=0; i<done; i++){
            if ( inString.charAt(i) != inString.charAt(check)){
                return false;
            }
        }
        check -= 1;
        return true;
    }
}
