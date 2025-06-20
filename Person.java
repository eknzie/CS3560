import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Watch> watches = new ArrayList<>();

    public Person() {}

    public void addWatch(Watch watch) {
        watches.add(watch);
    }

    public Movie[] getMovies() {
        return watches.stream().map(Watch::getMovie).toArray(Movie[]::new);
    }
}

public class Movie {
    private String name;
    private String genre;
    private List<Watch> watches = new ArrayList<>();

    public Movie() {}

    public void addWatch(Watch watch) {
        watches.add(watch);
    }

    public Person[] getPersons() {
        return watches.stream().map(Watch::getPerson).toArray(Person[]::new);
    }
}

public class Watch {
    private int rating;
    private Person person;
    private Movie movie;

    public Watch(int rating, Person person, Movie movie) {
        this.rating = rating;
        this.person = person;
        this.movie = movie;
        person.addWatch(this);
        movie.addWatch(this);
    }

    public Person getPerson() {
        return person;
    }

    public Movie getMovie() {
        return movie;
    }
}