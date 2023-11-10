package org.example.IMDBClone;

public class UserService {
    User user;

    public UserService(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void addReview(Movie movie, Review review){
        movie.getReviews().add(review);
    }

    public void addFavouriteMovie(Movie movie){
        getUser().getFavouriteMovies().add(movie);
    }
}
