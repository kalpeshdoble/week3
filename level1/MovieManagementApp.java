class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev;
    Movie next;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

class MovieManagementSystem {
    private Movie head;
    private Movie tail;

    public MovieManagementSystem() {
        this.head = null;
        this.tail = null;
    }

    // Add a movie at the beginning
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie at the end
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add a movie at a specific position
    public void addMovieAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 0) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = current.next;
            newMovie.prev = current;
            if (current.next != null) {
                current.next.prev = newMovie;
            }
            current.next = newMovie;
        }
    }

    // Remove a movie by Movie Title
    public void removeMovieByTitle(String title) {
        Movie current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Movie with title " + title + " not found.");
    }

    // Search for a movie by Director
    public void searchMovieByDirector(String director) {
        Movie current = head;
        while (current != null) {
            if (current.director.equals(director)) {
                System.out.println("Movie found: " + current.title + " (" + current.year + ") - Rating: " + current.rating);
            }
            current = current.next;
        }
    }

    // Search for a movie by Rating
    public void searchMovieByRating(double rating) {
        Movie current = head;
        while (current != null) {
            if (current.rating == rating) {
                System.out.println("Movie found: " + current.title + " (" + current.year + ") - Director: " + current.director);
            }
            current = current.next;
        }
    }

    // Display all movies in forward order
    public void displayMoviesForward() {
        Movie current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display all movies in reverse order
    public void displayMoviesReverse() {
        Movie current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    // Update a movie's rating based on the Movie Title
    public void updateMovieRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                System.out.println("Rating for movie '" + title + "' updated to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie with title " + title + " not found.");
    }
}

public class MovieManagementApp {
    public static void main(String[] args) {
        MovieManagementSystem movieSystem = new MovieManagementSystem();

        // Adding movies
        movieSystem.addMovieAtBeginning("Bahubali", "Raja maulli", 2010, 8.8);
        movieSystem.addMovieAtEnd("Theri", "Atlee kumar", 2008, 9.0);
        movieSystem.addMovieAtEnd("Partner", "David Dhawan", 1999, 8.7);
        movieSystem.addMovieAtPosition(1, "KGF", "Prashanth Neel", 2014, 10.0);

        // Displaying movies in forward order
        System.out.println("Movies in forward order:");
        movieSystem.displayMoviesForward();

        // Displaying movies in reverse order
        System.out.println("\nMovies in reverse order:");
        movieSystem.displayMoviesReverse();

        // Searching for movies by Director
        System.out.println("\nSearching movies by Director 'Christopher Nolan':");
        movieSystem.searchMovieByDirector("Christopher Nolan");

        // Searching for movies by Rating
        System.out.println("\nSearching movies with Rating 8.8:");
        movieSystem.searchMovieByRating(8.8);

        // Updating movie rating
        movieSystem.updateMovieRating("The Matrix", 9.2);

        // Removing a movie
        movieSystem.removeMovieByTitle("Inception");

        // Displaying movies after removal
        System.out.println("\nMovies after removal:");
        movieSystem.displayMoviesForward();
    }
}
