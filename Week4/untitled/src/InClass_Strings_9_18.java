public class InClass_Strings_9_18 {
    public static void main(String[] args) {
        String name = "Jack is an Apple fan";
        String name2 = new String("Jack");
//        name2 += " is an Apple fan";
        name2 = name2 + " " + "is an Apple fan";
        char tok = 'x';
        int count = howManyOfThese( name, tok);
        System.out.printf("\n String:%s tok:%s ct:%s", name, tok, count);
        if ( itIsExactMatch( name2, name)){
            System.out.printf("\n Yes Exact");
        } else {
            System.out.printf("\n No");
        }
        // Now for the split!
        String movie = "Avitar,Cameron,2008";
        int howMuch = getRevFromMovie( movie );
        System.out.printf("\nFrom movie:%s how Much:%s", movie, howMuch);
    }

    private static int getRevFromMovie(String movie) {
        int rev = 0;
        String[] toks = movie.split(",");
        try {
            rev = Integer.parseInt(toks[1]);
        } catch (NumberFormatException e) {
            rev = -9999;
        }
        return rev;
    }

    private static boolean itIsExactMatch(String str1, String str2) {
        boolean gotIt = true;
        // if ( str1 == str2 ) DO NOT DO THAT
        if ( !str1.equalsIgnoreCase(str2)) {
            gotIt = false;
        }
        return gotIt;
    }

    private static int howManyOfThese(String inString, char inTok) {
        int count = 0;
        for( int i = 0; i < inString.length(); i++ ) {
            if ( inString.charAt(i) == inTok ){
                count++;
            }
        }
        return count;
    }
}
