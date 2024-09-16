import java.util.Scanner;

public class GraderV2_9_4 {
    public static void main(String[] args) {
        // prompt user for 3 scores
        // output their aver and the letter grade
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int gr1 = getGrade( sc, n++ );
        int gr2 = getGrade( sc, n++ );
        int gr3 = getGrade( sc, n++ );
        double aver = getAverage( gr1, gr2, gr3 );
        int lowest = getLowestScore( gr1, gr2, gr3 );
        showAnswer( gr1, gr2, gr3, aver, lowest);
    }

    private static int getLowestScore(int gr1, int gr2, int gr3) {
        int lowest = gr1;
        if ( gr2 < lowest ){
            lowest = gr2;
        }
        if ( gr3 < lowest ){
            lowest = gr3;
        }
        return lowest;
    }

    private static void showAnswer(int gr1, int gr2, int gr3, double aver, int lowest) {
        System.out.printf("\nGr1:%s Gr2:%s Gr3:%s", gr1, gr2, gr3);
        System.out.printf("\nAver:%2.2f ", aver);
    }

    private static double getAverage(int gr1, int gr2, int gr3) {
        double aver = 0.0;
        int sum = gr1 + gr2 + gr3;
        aver = (double) sum / 3;
        return aver;
    }

    private static int getGrade(Scanner s, int inN ) {
        int grade = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.printf("\n Enter Grade%s:", inN);
            try {
                grade = s.nextInt();
                keepGoing = false;
            } catch (Exception e) {
                System.out.printf("\n Invalid Grade");
                s.nextLine();
            }
        }
        return grade;
    }
}
