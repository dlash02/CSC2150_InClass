public class City {
    private String name;
    private String state;
    private int population;
    private String[] suburb;
    private int[] travelTime;
    public City(String name, String state,  int population, String[] suburb, int[] travelTime) {
        this.name = name;
        this.state = state;
        this.population = population;
        this.suburb = suburb;
        this.travelTime = travelTime;
    }
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public double getPopPerSuburb() {
        double perc = (double) population/suburb.length;
        return perc;
    }
    public String[] getSuburb() {
        return suburb;
    }
    public String getLargestTravelTimeSuburb () {
        String largest = "";
        return largest;
    }

}
