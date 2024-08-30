//package Unit1;

import java.util.Scanner;

public class FirstOneInClass {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        int age = getAge( s );
        System.out.printf("\n Age:%s", age );
        String drive = "N";

         if ( age >= 16){
            drive = "Y";
        }
       System.out.printf("\nDrive:%s", drive );
       // System.out.printf("\nDrive:%s Vote:%s Drink:%s", drive, vote, drink);
        // 1. Make sure your file is called FirstOneInClass.java (anything else will not work)
        // 1.b Comment out line 15 and uncomment line 16 ... add vote and drink variables
        // 2. Complete the following by adding code:
        //   If the user enters an age:
        //      - 15 - output: Drive: Permit Only Vote:N Drink:N
        //      - 16 but less than 18 - output: Drive:Y Vote:N Drink:N
        //       - <15 - output: Drive:N Vote:N Drink:N
        //       - 18 but < 21 - output: Drive:Y Vote:Y Drink:N
        //       - 21 - 90 (inclusive) - output: Drive:Y Vote:Y Drink:Y
        //       - 91 or more - output: Drive:Y Vote:Y Drink:Not Recommended
        //  3. Be careful with:
        //   a. the file name it must be called FIrstOneInClass.java (case sensative)
        //   b. spaces in the output. For example, you must output:
        //   Drive:Y Vote:Y Drink:N
        //   And you should not output:
        //   Drive:Y Vote: Y Drink:   N
        // For this exercise you have unlimited attempts

    }
    private static int getAge( Scanner s) {
        int age = 0;
        final int MIN_AGE = 0;
        final int MAX_AGE = 130;
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
