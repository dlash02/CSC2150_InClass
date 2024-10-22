package PrepString;

import java.util.ArrayList;

public class DriveStringLib {
    public static void main(String[] args) {
        String n = new String("Jackson");
        StringReviewLib srl = new StringReviewLib( n );
        String backwName = srl.reverseString();
        ArrayList<String> res = srl.findAllSubstrings();
        if ( srl.containsSubstring("ack!")){
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }
        if ( srl.startsWithPrefix("Jack")){
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }
    }

}
