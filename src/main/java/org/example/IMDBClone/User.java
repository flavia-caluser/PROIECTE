package org.example.IMDBClone;

import java.util.List;

public class User {
    private String lastName;
    private String firstName;
    private String role;
    private List<Movie> favouriteMovies;

    public User(String lastName, String firstName, String role, List<Movie> favouriteMovies) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.role = role;
        this.favouriteMovies = favouriteMovies;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Movie> getFavouriteMovies() {
        return favouriteMovies;
    }

    public void setFavouriteMovies(List<Movie> favouriteMovies) {
        this.favouriteMovies = favouriteMovies;
    }
    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", role='" + role + '\'' +
                ", favouriteMovies=" + favouriteMovies +
                '}';
    }

}
