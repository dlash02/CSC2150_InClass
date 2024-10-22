package InClass_10_11;

import prep.FileIO;

import java.io.IOException;
import java.util.ArrayList;

public class DriveFileIO {
    public static void main(String[] args) {
        String fName = "data/inNumber.txt";
        FileIO fio = new FileIO( fName);
        try {
            fio.setFileData();
            ArrayList<String> inStrNumbers = fio.getFileData();
            System.out.printf("\n must be size:%s", inStrNumbers.size());
            showTheData( inStrNumbers);
            ArrayList<Integer> inNUmbers = convertToNumbers( inStrNumbers);
            int sum = 0;
            for( int number : inNUmbers ) {
                sum += number;
            }
            System.out.printf("\n sum:%s", sum);
        } catch (IOException e) {
            System.out.printf("\n Oh oh File:%s not found", fName);
            e.printStackTrace();
        }
    }

    private static ArrayList<Integer> convertToNumbers(ArrayList<String> inStrNumbers) {
        ArrayList<Integer> inNumbers = new ArrayList<>();
        for( String sNum : inStrNumbers) {
            try {
                inNumbers.add(Integer.parseInt(sNum));
            } catch (NumberFormatException e) {
                System.out.printf("\n Illegal number:%s", sNum );
                System.out.printf("\n Msg:%s", e.getMessage());
                System.exit(1);
            }
        }
        return inNumbers;
    }

    private static void showTheData(ArrayList<String> inStrNumbers) {

    }
}
