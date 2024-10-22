package prep;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class DriveFileIO {
    public static void main(String[] args) throws FileNotFoundException {
        FileIO fIO = new FileIO("data/inNumber.txt");
        try {
            fIO.setFileData();
            ArrayList<String> strNumbers = fIO.getFileData(); // returns string
                                                              // would need to convert if want numbers
            showData( strNumbers);
        } catch (IOException e) {
            System.out.printf("\n Something went wrong m:%s", e.getMessage());
            e.printStackTrace();
        }
    }

    private static void showData(ArrayList<String> strNumbers) {
        for( String n : strNumbers ) {
            System.out.printf("\n%s", n);
        }
    }
}
