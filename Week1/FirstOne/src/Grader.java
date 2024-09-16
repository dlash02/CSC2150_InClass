public class Grader {
    private int gr1;
    private int gr2;
    private int gr3;

    public Grader(int grade1, int gr2, int gr3) {
        this.gr1 = grade1;
        this.gr2 = gr2;
        this.gr3 = gr3;
    }
    public double getAverage() {
        double aver = 0.0;
        int sum = this.gr1 + this.gr2 + this.gr3;
        aver = (double) sum / 3;
        return aver;
    }

    public int getGr1() {
        return gr1;
    }
    public  int getLowestScore( ) {
        int lowest = this.gr1;
        if ( this.gr2 < lowest ){
            lowest = this.gr2;
        }
        if ( this.gr3 < lowest ){
            lowest = this.gr3;
        }
        return lowest;
    }
    public int getHighestScore() {
        int highestScore = 0;
        return highestScore;
    }
}
