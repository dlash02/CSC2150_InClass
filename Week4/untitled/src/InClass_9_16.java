import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InClass_9_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = getGrades( sc );
        System.out.printf("\n Received:%s items",
                grades.size());
        double averGr = getAverage( grades );
        System.out.printf("\n Average:%.2f",
                averGr );
//        Collections.sort( grades );
        showAllGrades( grades );
        double lowest = getLowestGrade( grades );
        grades.remove( lowest );
        showAllGrades( grades );
        // then drop lowest grade
        // recalulcate and output the average
    }

    private static double getLowestGrade(ArrayList<Double> grades) {
        double lowest = Double.MAX_VALUE;
        for( double gr : grades ) {
            if ( gr < lowest ) {
                lowest = gr;
            }
        }
        return lowest;
    }

    private static void showAllGrades(ArrayList<Double> grades) {
        for( double grade : grades ){
            System.out.printf("\n%.2f",grade);
        }
    }

    private static double getAverage(ArrayList<Double> grades) {
        double average = 0.0;
        double sum = 0.0;
        for( double grade : grades ) {
            sum += grade;
        }
        if ( grades.size() > 0 ){
            average =  sum / grades.size();
        }

        return average;
    }

    private static ArrayList<Double> getGrades(Scanner sc) {
        ArrayList<Double> grades = new ArrayList<>();
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.printf("\n Enter a double or -999 to stop");
            try{
                double gr = sc.nextDouble();
                if ( gr == -999 ){
                    keepGoing = false;
                } else {
                    grades.add( gr );
                }
            } catch ( Exception e ) {
                System.out.printf("\n Input bad=> Try Again..");
                sc.nextLine();
            }
        }
        return grades;
    }
}
