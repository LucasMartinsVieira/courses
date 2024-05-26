package test.manytomany;

import infra.DAO;
import model.manytomany.Actor;
import model.manytomany.Movie;

public class NewMovieActor {
    public static void main(String[] args) {
        Movie movieA = new Movie("Star Wars Ep 4", 8.9);
        Movie movieB = new Movie("The fugitive", 8.1);

        Actor actorA = new Actor("Harrison Ford");
        Actor actressB = new Actor("Carrie Fisher");

        movieA.addActor(actorA);
        movieA.addActor(actressB);

        movieB.addActor(actorA);

        DAO<Movie> dao = new DAO<>();
        dao.includeAtomic(movieA);
    }
}
