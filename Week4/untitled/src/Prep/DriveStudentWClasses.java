package Prep;

import java.util.ArrayList;

public class DriveStudentWClasses {
    public static void main(String[] args) {
        ArrayList<StudentV2> students = getStudents();
        System.out.printf("\n We have %s students enrolled", students.size());
        showStudentIn( students, "CSC");
    }

    private static void showStudentIn(ArrayList<StudentV2> students, String inMajor) {
        for (StudentV2 student : students) {
            if ( student.getMajor().equalsIgnoreCase(inMajor)){
                System.out.printf("\n Name:%s Major:%s, courses Complete:%s", student.getStudentName(), student.getMajor(), student.getCompletedCourses().size());
            }
        }
    }

    private static ArrayList<StudentV2> getStudents() {
        ArrayList<CompletedCourse> courses = new ArrayList<>();
//        ublic CompletedCourse(String courseName, int year, String term,
//        double grade, String courseField) {
        ArrayList<StudentV2> students = new ArrayList<>();
        courses.add(new CompletedCourse("CSC2200", 2023, "Fall", 4.0, "CSC"));
        courses.add(new CompletedCourse("CSC1700", 2023, "Fall", 3.5, "CSC"));
        StudentV2 s1 = new StudentV2(courses, "CSC", "Jack");
        students.add(s1);
        ArrayList<CompletedCourse> courses1 = new ArrayList<>();
        courses1.add(new CompletedCourse("CSC2200", 2021, "Fall", 4.0, "CSC"));
        courses1.add(new CompletedCourse("CSC1700", 2021, "Fall", 4.0, "CSC"));
        courses1.add(new CompletedCourse("CSC2300", 2021, "Fall", 4.0, "CSC"));
        courses1.add(new CompletedCourse("MAT1000", 2021, "Fall", 4.0, "CSC"));
        StudentV2 s2 = new StudentV2(courses1, "MAT", "Jill");
        students.add(s2);
        ArrayList<CompletedCourse> courses2 = new ArrayList<>();
        courses2.add(new CompletedCourse("CSC2200", 2021, "Fall", 4.0, "CSC"));
        courses2.add(new CompletedCourse("CSC1700", 2021, "Fall", 4.0, "CSC"));
        courses2.add(new CompletedCourse("CSC2300", 2021, "Fall", 4.0, "CSC"));
        courses2.add(new CompletedCourse("MAT1000", 2021, "Fall", 4.0, "CSC"));
        courses2.add(new CompletedCourse("MAT2000", 2021, "Fall", 4.0, "CSC"));
        StudentV2 s3 = new StudentV2(courses2, "CSC", "Jenny");
        students.add(s3);
        return students;
    }
}
