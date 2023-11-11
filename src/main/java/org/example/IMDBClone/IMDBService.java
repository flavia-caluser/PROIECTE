package org.example.IMDBClone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
          Map<Genre,List<String>> moviesByGenre = new HashMap<>();
          for (Movie movie: getMovieList()){
               Genre genre = movie.getGenre();
               if (!moviesByGenre.containsKey(genre)){
                    List<String> thisGenreList = new ArrayList<>();
                    thisGenreList.add(movie.getTitle());
                    moviesByGenre.put(genre,thisGenreList);
               }else{
                     moviesByGenre.get(genre).add(movie.getTitle());
               }
          }
          return moviesByGenre;
     }

     public List<String> getMoviesWithActor(Actor actor){
          List<String> moviesWithActor = new ArrayList<>();
          for (Movie movie: getMovieList()){
               if (movie.getActors().contains(actor)){
                    moviesWithActor.add(movie.getTitle());
               }
          }
          return moviesWithActor;
     }




}
