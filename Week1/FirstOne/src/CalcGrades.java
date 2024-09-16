import java.util.Scanner;

public class CalcGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int gr1 = getGrade( sc, n++ );
        int gr2 = getGrade( sc, n++ );
        int gr3 = getGrade( sc, n++ );
        // Create grader as an object from the Grader class
        Grader g = new Grader( gr1, gr2, gr3);
        double aver = g.getAverage();
        System.out.printf("\naver=%s\n", aver);
//        g.gr1 = 100;
        System.out.printf("\n gr1=%s\n", g.getGr1());
        System.out.printf("\n Lowest is:%s", g.getLowestScore());

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
