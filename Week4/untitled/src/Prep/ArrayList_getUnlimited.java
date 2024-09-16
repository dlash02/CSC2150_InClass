package Prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_getUnlimited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = getGrades( sc );
        Collections.sort( grades );
        showScores( grades );
        double averScor = getAverageScore( grades );
        System.out.printf("\nAverage score is: %.2f", averScor);
        double bestSc = getHighestScore ( grades );
        System.out.printf("\nHighest score is: %.2f", bestSc);
    }

    private static void showScores(ArrayList<Double> scores ) {
        int ct = 0;
        for( Double score : scores ) {
            System.out.printf("\n ct:%s Score:%s", ct++, score);
        }
    }

    private static double getHighestScore(ArrayList<Double> grades) {
        //ToDo: return highest score
        return 0.0;
    }

    private static double getAverageScore(ArrayList<Double> grades) {
        double sum = 0;
        for ( double grade : grades ) {
            sum += grade;
        }
        double aver = 0.0;
        if ( grades.size() > 0 ){
            aver = (double) sum / grades.size();
        }
        return aver;
    }

    private static ArrayList<Double> getGrades(Scanner sc) {
        ArrayList<Double> inGRades = new ArrayList<>();
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.printf("\n Enter grade or -999 to stop");
            try {
                double grade = sc.nextDouble();
                if ( grade == -999 ){
                    keepGoing = false;
                } else {
                    inGRades.add( grade );
                }
            } catch ( Exception e ){
                System.out.printf("\n Input Error must be a double ... try again");
                sc.nextLine();
            }
        }
        return inGRades;
    }
}
