package InClass_9_20;

public class DriveStringRevLib {
    public static void main(String[] args) {
        String myString = "ABBA";
        StringReviewLib srlib = new StringReviewLib( myString);
        String revStr = srlib.reverseString();
        System.out.printf("\n RevString=%s\n", revStr);
    }
}
