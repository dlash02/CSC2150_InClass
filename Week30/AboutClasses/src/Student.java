public class Student {
    private String studentName;
    private String major;
    private double gpa;
    private int coursesDone;

    public Student(String studentName, String major, double gpa, int coursesDone) {
        this.studentName = studentName;
        if ( !isValidMajor(major) ){
            throw new IllegalArgumentException("Invalid major");
        } else {
            this.major = major;
        }
        this.gpa = gpa;
        this.coursesDone = coursesDone;
    }
    public int getNumberOfCoursesLeft( int needed ){
        int numLeft = needed - coursesDone;
        return numLeft;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCoursesDone() {
        return coursesDone;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMajor(String major) {
        if ( !isValidMajor( major )){
            throw new IllegalArgumentException( "Major must be CSC or CYB" );
        }
        this.major = major;
    }

    private boolean isValidMajor(String major) {
        boolean validMajor = false;
        if ( major.equalsIgnoreCase("CSC") ||
                major.equalsIgnoreCase("CYB") ){
            validMajor = true;
        }
        return validMajor;
    }
}
