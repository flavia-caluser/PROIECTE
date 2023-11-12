package org.example.IMDBClone;

import java.util.Comparator;

public class ReleaseYearComparator implements Comparator<Movie> {


    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.valueOf(o1.getReleaseYear()).compareTo(Integer.valueOf(o2.getReleaseYear()));
    }
}
