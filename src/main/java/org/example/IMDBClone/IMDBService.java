package org.example.IMDBClone;

import java.util.*;

public class IMDBService {
    List<Movie> movieList;
    List<User> users;

    public IMDBService(List<Movie> movieList, List<User> users) {
        this.movieList = movieList;
        this.users = users;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<Genre, List<String>> groupMoviesByGenre() {
        Map<Genre, List<String>> moviesByGenre = new HashMap<>();
        for (Movie movie : getMovieList()) {
            Genre genre = movie.getGenre();
            if (!moviesByGenre.containsKey(genre)) {
                List<String> thisGenreList = new ArrayList<>();
                thisGenreList.add(movie.getTitle());
                moviesByGenre.put(genre, thisGenreList);
            } else {
                moviesByGenre.get(genre).add(movie.getTitle());
            }
        }
        return moviesByGenre;
    }

    public List<String> getMoviesWithActor(Actor actor) {
        List<String> moviesWithActor = new ArrayList<>();
        for (Movie movie : getMovieList()) {
            if (movie.getActors().contains(actor)) {
                moviesWithActor.add(movie.getTitle());
            }
        }
        return moviesWithActor;
    }

    public List<Movie> moviesByReleaseYear() {
        movieList.sort(new ReleaseYearComparator());
        return movieList;
    }


    public List<Movie> moviesSortedByRating() {
        Collections.sort(movieList);
        return movieList;
    }

    public Set<Actor> getActorsFromMovieTypeAndGenre(Type type, Genre genre) {
        Set<Actor> searchedActors = new HashSet<>();
        for (Movie movie : movieList) {
            if (movie.getType().equals(type) && movie.getGenre().equals(genre)) {
                //Collections.addAll(movie.getActors());
                for (Actor actor : movie.getActors()) {
                    searchedActors.add(actor);
                }
            }
        }
        return searchedActors;
    }

    public Movie getBestRatedMovieByTypeAndGenre(Type type, Genre genre) {
        Movie bestRatedMovie = new Movie();
        for (Movie movie : movieList) {
            if (movie.getType().equals(type) && movie.getGenre().equals(genre)) {
                if (movie.getAverageReview() > bestRatedMovie.getAverageReview()) {
                    bestRatedMovie = movie;
                }
            }
        }
        return bestRatedMovie;
    }
}
