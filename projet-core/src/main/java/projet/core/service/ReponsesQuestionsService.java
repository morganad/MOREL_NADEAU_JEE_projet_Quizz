package projet.core.service;

import projet.core.dao.ReponsesQuestionsDAO;
import projet.core.entity.ReponsesQuestions;

public class ReponsesQuestionsService {

    private ReponsesQuestionsDAO reponsesQuestionsDAO;

    public ReponsesQuestionsService(final ReponsesQuestionsDAO reponsesQuestionsDAO) { this.reponsesQuestionsDAO = reponsesQuestionsDAO; }
}
