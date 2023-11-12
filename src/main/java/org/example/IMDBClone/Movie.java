package org.example.IMDBClone;

import java.util.List;

public class Movie implements Comparable<Movie> {

    private String title;
    private int releaseYear;
    private Genre genre;
    private Type type;
    private List<Actor> actors;
    private List<Review> reviews;

    public Movie(String title, int releaseYear, Genre genre, Type type, List<Actor> actors, List<Review> reviews) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.type = type;
        this.actors = actors;
        this.reviews = reviews;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre=" + genre +
                ", type=" + type +
                ", actors=" + actors +
                ", reviews=" + reviews +
                '}';
    }

    public int getAverageReview(){
        int sum = 0;
        int counter =0;
        for (Review review: getReviews()){
            sum+= review.getValue();
            counter++;
        }
        return sum/counter;
    }

    @Override
    public int compareTo(Movie anotherMovie) {
        return Integer.compare(this.getAverageReview(),anotherMovie.getAverageReview());
    }


}
