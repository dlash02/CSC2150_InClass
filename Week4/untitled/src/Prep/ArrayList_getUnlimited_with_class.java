package Prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_getUnlimited_with_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = getGrades( sc );
        Collections.sort( grades );
        showScores( grades );
        Grades gr1 = new Grades( grades, "Jackie" );
        double aver = gr1.getAverageScore();
        System.out.printf("\nHighest score is: %.2f", gr1.getAverageScore());
    }
    private static void showScores(ArrayList<Double> scores ) {
        int ct = 0;
        for( Double score : scores ) {
            System.out.printf("\n ct:%s Score:%s", ct++, score);
        }
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
