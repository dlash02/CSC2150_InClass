package Prep;

import java.util.ArrayList;

public class StudentV2 {
    private String studentName;
    private String major;
    private ArrayList<CompletedCourse> completedCourses;

    public StudentV2(ArrayList<CompletedCourse> completedCourses, String major, String studentName) {
        this.completedCourses = completedCourses;
        this.major = major;
        this.studentName = studentName;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getMajor() {
        return major;
    }
    public ArrayList<CompletedCourse> getCompletedCourses() {
        return completedCourses;
    }
    public int addCompletedCourse(CompletedCourse course) {
        int retVal = 0;
        int inx = 0;
        boolean found = false;
       for( CompletedCourse c : completedCourses ) {
           if( c.getCourseName().equals(course.getCourseName()) ) {
               completedCourses.set( inx, c );
               found = true;
               retVal = 1;
           }
           inx++;
       }
       if( !found ) {
           completedCourses.add(course);
       }
       return retVal;
    }
}