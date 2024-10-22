package Prep;

public class CompletedCourse {
    private String courseName;
    private int year;
    private String term;
    private double grade;
    private String courseField;
    public CompletedCourse(String courseName, int year, String term,
                           double grade, String courseField) {
        this.courseName = courseName;
        this.year = year;
        this.term = term;
        this.grade = grade;
        this.courseField = courseField;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getYear() {
        return year;
    }

    public String getTerm() {
        return term;
    }

    public double getGrade() {
        return grade;
    }
    public String getCourseField() {
        return courseField;
    }
}