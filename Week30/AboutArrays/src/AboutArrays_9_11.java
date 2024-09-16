public class AboutArrays_9_11 {
    public static void main(String[] args) {
        String[] Teams = new String[5];
        String[] names = { "Jeff", "Janet", "Jackie", "Jay", "James"};
        int[] finalEx = {99, 77, 88, 100, 99};
        int[] midtermEx = {66, 44, 55, 100, 100};
        double[] finalScore = new double[finalEx.length];
        for( int i = 0; i < finalEx.length; i++ ){
            finalScore[i] = (double)(finalEx[i] + midtermEx[i]) / 2;
        }
        names[4] = "JJJ";
        showFinalScores( names, finalScore);

    }

    private static void showFinalScores(String[] students, double[] scores) {
        int ct = 0;
        for( String student : students ){
            System.out.printf("\n Student:%s Score:%s", student, scores[ct]);
            ct = ct + 1; // ct++

        }
        System.out.printf("\n ----------------------------------");
        for( int i = 0; i <= students.length; i++ ){
            System.out.printf("\n Student:%s Score:%s", students[i], scores[i]);
        }
    }
}
