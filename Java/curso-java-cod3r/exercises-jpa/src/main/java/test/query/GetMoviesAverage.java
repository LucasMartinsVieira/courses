package test.query;

import infra.DAO;
import model.query.GradeMovie;

public class GetMoviesAverage {
    public static void main(String[] args) {
        DAO<GradeMovie> dao = new DAO<>(GradeMovie.class);
        GradeMovie grade = dao.queryOne("getGeneralMoviesAverage");

        System.out.println(grade.getAverage());
        dao.close();
    }
}
