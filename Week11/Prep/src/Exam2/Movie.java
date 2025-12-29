package Exam2;

import java.time.LocalDate;

public class Movie {
    // Constants for validation
    private static final int CURRENT_YEAR = LocalDate.now().getYear();
    private static final int FIRST_MOVIE_YEAR = 1888; // First motion picture
    private static final int CLASSIC_AGE_THRESHOLD = 25;
    private static final double MIN_RATING = 0.0;
    private static final double MAX_RATING = 11.0;
    private static final String[] VALID_GENRES = {
            "Action", "Comedy", "Drama", "Horror", "Romance",
            "Sci-Fi", "Thriller", "Animation", "Crime", "Documentary",
            "Western", "Musical"   // added for your dataset
    };

    private String title;
    private String director;
    private int year;
    private double rating;
    private String genre;

    //  Proper constructor
    public Movie(String title, String director, int year, double rating, String genre) {
        setTitle(title);
        setDirector(director);
        setYear(year);
        setRating(rating);
        setGenre(genre);
    }

    // Check if movie is a classic (older than 30 years)
    public boolean isClassic() {
        return (CURRENT_YEAR - year) > CLASSIC_AGE_THRESHOLD;
    }

    // Getter methods
    public String getTitle() { return "" ; }
    public String getDirector() { return director; }
    public int getYear() { return year; }
    public double getRating() { return rating; }
    public String getGenre() { return genre; }

    // Setter methods with validation
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            this.title = "Unknown title";
        } else {
            this.title = title.trim();
        }
    }

    public void setDirector(String director) {
        if (director != null && !director.trim().isEmpty()) {
            this.director = director.trim();
        } else {
            this.director = "Unknown Director";
        }
    }

    public void setYear(int year) {
//        if (year >= FIRST_MOVIE_YEAR && year <= ) {
//            this.year = year;
//        } else {
//            this.year = CURRENT_YEAR;
//        }
    }

    public void setRating(double rating) {
        if (rating >= MIN_RATING && rating <= MAX_RATING) {
            this.rating = rating;
        } else {
            this.rating = 0.0;
        }
    }

    public void setGenre(String genre) {
        if () {
            this.genre = genre.trim();
        } else {
            this.genre = "Unknown";
        }
    }

    public static boolean isValidGenre(String genre) {
        if (genre == null) return false;
        for (String valid) {
            if (valid.equalsIgnoreCase(genre.trim())) {
                return true;
            }
        }
        return false;
    }

    public int getage() {
        return CURRENT_YEAR - year;
    }

    public String getAgeCategory() {
        int age = getAge();
        if (age > 50) {
            return "Vintage";
        } else if (age > 30) {
            return "Classic";
        } else if (age > 10) {
            return "Modern";
        } else {
            return ;
        }
    }

    // Properly overridden toString()

    public String toString() {
        return String.format(
                "%s (%d) - Director: %s, Genre: %s, Rating: %.1f/10 Category: %s",
                title, year, director, genre, rating, this.getAgeCategory()
        );
    }
}