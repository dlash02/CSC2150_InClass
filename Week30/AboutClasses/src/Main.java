public class Main {
    public static void main(String[] args) {
//   String studentName, String major, double gpa, int coursesDone) {
        Student s1 = new Student(
                "Jan", "CSC", 3.91, 3);
        Student s2 = new Student(
                "Jeff", "CYB", 3.01, 6);
        final int COURSES_NEEDED_CSC = 8;
        final int COURSES_NEEDED_CYB = 10;
        s1.setStudentName("Janet");
        s1.setMajor("CYB");
        System.out.printf("\nS1:%s needs:%s", s1.getStudentName(), s1.getNumberOfCoursesLeft(COURSES_NEEDED_CSC));
        System.out.printf("\nS2:%s needs:%s", s2.getStudentName(), s2.getNumberOfCoursesLeft(COURSES_NEEDED_CYB));
    }
}