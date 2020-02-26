package projet.core.service;

import projet.core.dao.QuizzDAO;


public class QuizzService {

    private QuizzDAO quizzDAO;

    public QuizzService(final QuizzDAO quizzDAO) { this.quizzDAO = quizzDAO; }
}
