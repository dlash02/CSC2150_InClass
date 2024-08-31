import java.util.Scanner;

public class InClas830 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int MAX_AGE = 130;

        int inNumb = getNumber( s, MAX_AGE );
        for ( int i=0; i<inNumb; i-=2 ) {
            System.out.printf("\ni:%s", i);
        }
    }
    private static int getNumber( Scanner s, int MAX_AGE ) {
        int age = 0;
        final int MIN_AGE = 0;
//        final int MAX_AGE = 130;
        boolean gotGoodAge = false;
        while ( !gotGoodAge ){
            System.out.printf("\n Enter Age =>");
            try {
                age = s.nextInt();
                if ( age < MIN_AGE || age >= MAX_AGE){
                    System.out.printf("\0n Error Age:%s must be between min:%s and max:%s ",
                            age, MIN_AGE, MAX_AGE);
                } else{
                    gotGoodAge = true;
                }
            } catch ( Exception e ){
                System.out.printf("\n Age:%s must be an integer value ", age);
                s.nextLine(); // Must reset scanner to expect next line
            }
        }
        return age;
    }
}
