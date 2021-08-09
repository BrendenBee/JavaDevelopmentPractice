package composition;

import java.util.List;

public class NetflixMovieLibrary {
    //final field needs to be part of constructor, or else it can be undefined

    private final List<NetflixMovie> movies;

    public NetflixMovieLibrary(List<NetflixMovie> movies) {
        this.movies = movies;
    }

    public List<NetflixMovie> getMovies() {
        return movies;
    }
}
