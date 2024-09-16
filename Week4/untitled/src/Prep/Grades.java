package Prep;

import java.util.ArrayList;

public class Grades {
    private ArrayList<Double> grades;
    private  String name;
    private double aver;
    public Grades(ArrayList<Double> grades, String name) {
        this.grades = grades;
        this.name = name;
    }
    public void  setAverageScore() {
        double sum = 0;
        for ( double grade : grades ) {
            sum += grade;
        }
        double aver = 0.0;
        if ( grades.size() > 0 ){
            this.aver = (double) sum / grades.size();
        }
    }
    public double getAverageScore() {
        setAverageScore();
        return aver;
    }
    public double  getHighestScore() {
        //ToDo: return highest score
        double highest = Double.MIN_VALUE;
        for ( double grade : grades ) {
            if ( grade > highest ) {
                highest = grade;
            }
        }
        return highest;
    }
}
