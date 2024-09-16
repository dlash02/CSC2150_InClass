public class Main {
    public static void main(String[] args) {

       char[] myCharacterList;

       myCharacterList = new char[10];
       int[] myIntArray = new int[10];
       double[] myDoubleArray = new double[10];
        String[] myStringList = new String[10];

       String[] names = {"Jeff", "Janet", "Jackie", "Jay", "James"};
       int[] finalExam = {99, 77, 88, 100, 76};
       int[] midterm = { 66, 44, 55, 100, 98};
       double[] finalScore = new double[5];

       for (int i = 0; i < names.length; i++) {
          int finalEx = finalExam[i];
          double finalSc = (double) (finalEx + midterm[i] ) / 2;
          finalScore[i] = finalSc;
          finalScore[i] = (double) (finalExam[i] + midterm[i]) / 2;
       }
       showFinalGrades(  names,  finalScore );

       double classAverage = getClassAverScore( finalScore);
        System.out.printf("\n Class Average:%s", classAverage);
    }



    private static void showFinalGrades(String[] names, double[] finalScore) {
        for( double grade : finalScore) {
            System.out.printf("\nct:%s grade:%s", grade);
        }
        System.out.printf("\n ---------- f");
        int ct = 0;
        for( double grade : finalScore) {
            System.out.printf("\nct:%s grade:%s", ct, grade);
            System.out.printf("\nct:%s name:%s grade:%s", ct, names[ct], grade);
            ct = ct + 1;
        }
    }
    private static double getClassAverScore(double[] finalScore) {
        double aver = 0.0;
        return aver;
    }
}