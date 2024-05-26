package test.query;

import infra.DAO;
import model.manytomany.Actor;
import model.manytomany.Movie;

import java.util.List;

public class GetMovies {
    public static void main(String[] args) {
        DAO< Movie> dao = new DAO<>(Movie.class);
        List<Movie> movies = dao.query("moviesRatedHigherThan", "grade", 8.5);

        System.out.println(movies.size());
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " => " + movie.getGrade());

            for (Actor actor : movie.getActors()) {
                System.out.println(actor.getName());
            }
        }
    }
}
