package PrepRecur;

public class RecurPalin {
    public static void main(String[] args) {
        String str1 = "hannah";
        str1 = "abcba";
        checkPalin1( str1 );

         str1 = "hannah";
        str1 = "abcba";
        checkPalin2( str1 );

        }
    private static void checkPalin1(String str1) {
        if ( isPalin( str1 )) {
            System.out.printf("\n Yes Palin1:%s", str1);
        } else {
            System.out.printf("\n No  Palin1:%s", str1);
        }

    }
    public static boolean isPalin(String str1) {
        int check1 = str1.length() -1 ;
        for( int i=0; i < str1.length()/2; i++) {
            if ( str1.charAt(i) != str1.charAt(check1)) {
                System.out.printf("\n NO! c1:%s c2:%s", str1.charAt(i), str1.charAt(check1));
                return false;
            } else {
                System.out.printf("\n OK! c1:%s c2:%s", str1.charAt(i), str1.charAt(check1));
            }
            check1 -= 1;
        }
        return true;
    }
    private static void checkPalin2(String str1) {
        if ( isPalin2( str1 )) {
            System.out.printf("\n Yes Palin2:%s", str1);
        } else {
            System.out.printf("\n No  Palin2:%s", str1);
        }

    }
    private static boolean isPalin2(String s ) {
        if (s.length() <= 1) // Base case
             return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case
            return false;
        else
                   return isPalin2(s.substring(1, s.length() - 1));
    }

}

