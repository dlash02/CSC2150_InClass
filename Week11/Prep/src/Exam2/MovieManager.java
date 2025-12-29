package Exam2;

import java.util.ArrayList;

public class MovieManager {
    public static void main(String[] args) {
        // Create ArrayList to store movies
        ArrayList<Movie> movieCollection = new ArrayList<>();

        loadMovieData(movieCollection);

        showAllMovies(movieCollection);

        final double HIGH_RATING_THRESHOLD = 9.0;

        showHighRated(movieCollection, HIGH_RATING_THRESHOLD);

        showMoviesByDirector(movieCollection, "Christopher Nolan");

        updateMovieRating(movieCollection, "Pulp Fiction", 7.9);

        showMoviesByDirector(movieCollection, "Quentin Tarantino");

        showMovieStats(movieCollection, HIGH_RATING_THRESHOLD);
    }

    // Method to load predefined movie data
    public static void loadMovieData(ArrayList<Movie> movies) {
        movies.add(new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 9.3, "Drama"));
        movies.add(new Movie("The Godfather", "Francis Ford Coppola", 1972, 9.2, "Crime"));
        movies.add(new Movie("The Dark Knight", "Christopher Nolan", 2008, 9.0, "Action"));
        movies.add(new Movie("Oppenheimer", "Christopher Nolan", 2023, 8.3, "Drama"));
        movies.add(new Movie("Pulp Fiction", "Quentin Tarantino", 1994, 8.9, "Crime"));
        movies.add(new Movie("Forrest Gump", "Robert Zemeckis", 1994, 8.8, "Drama"));
        movies.add(new Movie("Inception", "Christopher Nolan", 2010, 8.7, "Sci-Fi"));
        movies.add(new Movie("The Matrix", "The Wachowskis", 1999, 8.7, "Sci-Fi"));
        movies.add(new Movie("Goodfellas", "Martin Scorsese", 1990, 8.7, "Crime"));
        movies.add(new Movie("Dune: Part Two", "Denis Villeneuve", 2024, 8.5, "Sci-Fi"));
        movies.add(new Movie("Titanic", "James Cameron", 1997, 7.9, "Romance"));
        movies.add(new Movie("The Good, The Bad and The Ugly", "Sergio Leone", 1966, 8.8, "Western"));
        movies.add(new Movie("Avatar", "James Cameron", 2009, 7.9, "Sci-Fi"));
        movies.add(new Movie("Toy Story", "John Lasseter", 1995, 8.3, "Animation"));
        movies.add(new Movie("Everything Everywhere All at Once", "Daniels", 2022, 7.8, "Sci-Fi"));
        movies.add(new Movie("Star Wars", "George Lucas", 1977, 10.1, "Sci-Fi"));
        movies.add(new Movie("Jaws", "Steven Spielberg", 1975, 8.1, "Thriller"));
        movies.add(new Movie("Battlefield Earth", "Roger Christian", 2000, 3.1, "Sci-Fi"));
        movies.add(new Movie("Singin' in the Rain", "Stanley Donen", 1952, 8.3, "Musical"));
        movies.add(new Movie("The Room", "Tommy Wiseau", 2003, 0.0, "Drama"));
    }

    // Method to print all movies
    public static void showAllMovies(ArrayList<Movie> movies) {
        System.out.println("=== All Movies in Collection Author: Ivan Rangel ===");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println();
    }

    // Method to find and display high-rated movies
    public static void showHighRated(ArrayList<Movie> movies, double highRateThreshold) {
        System.out.printf("  Rated Movies (>= %.1f) %n", highRateThreshold);
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getRating() >= highRateThreshold) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found above threshold.");
        }
        System.out.println();
    }

    // Method to find movies by a specific director
    public static void showMoviesByDirector(ArrayList<Movie> movies, String director) {
        System.out.println("=== Movies by " + director + " ===");
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getDirector().equals(director)) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found by " + director);
        }
        System.out.println();
    }

    // Method to calculate and display collection statistics
    public static void showMovieStats(ArrayList<Movie> movies, double highRateThreshold) {
        if (movies.isEmpty()) {
            System.out.println("No movies in collection.");
            return;
        }
        double totalRating = 0;
        int highRatedCount = 0;
        int classicCount = 0;

        int oldestYear = movies.get(0).getYear();
        int newestYear = movies.get(0).getYear();

        for (Movie movie : movies) {
            totalRating += movie.getRating();
            if (movie.getRating() > highRateThreshold) {
                highRatedCount++;
            }
            if (movie.isClassic()) {
                classicCount++;
            }
            if (movie.getYear() < oldestYear) {
                oldestYear = movie.getYear();
            }
            if (movie.getYear() > newestYear) {
                newestYear = movie.getYear();
            }
        }

        double averageRating = totalRating / movies.size();

        System.out.println(" Collection");
        System.out.println("Total movies: " + movies.size());
        System.out.printf("Average rating: ", averageRating);
        System.out.println("High-rated movies: " + highRatedCount);
        System.out.println("Classic movies: " + classicCount);
        System.out.println("Year range: " + oldestYear + " - " + newestYear);
        System.out.println();
    }

    // Method to update a movie's rating
    public static void updateMovieRating(ArrayList<Movie> movies, String title, double newRating) {
        System.out.println(" " + title);
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                double oldRating ;
                movie.setRating(newRating);
                System.out.printf("Updated '%s' rating  %.1f to %.1f%n", title, oldRating, movie.getRating());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Movie '" + title + "' not located.");
        }
        System.out.println();
    }
}