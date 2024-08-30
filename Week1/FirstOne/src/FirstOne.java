import java.util.Scanner;

public class FirstOne {
    public static void main(String[] args) {
        int age = getUserAge();
        System.out.printf("\n Age:%s", age);
        String drive = "N";
        final int TOO_OLD = 100;

        if ( age >= TOO_OLD ){
            drive = "You should stop";
        } else if ( age >= 16 ){
            drive = "Y";
        } else if ( age == 15 ){
            drive = "With Permit";
        } else {
            drive = "N";
        }
//        System.out.printf("\n Drive:%s", drive);
//        System.out.printf("\nDrive:%s Vote:%s Drink:%s", drive, vote, drink);
    }
    public static int getUserAge() {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nPlease enter your age: ");
        age = sc.nextInt();
        return age;
    }
}
