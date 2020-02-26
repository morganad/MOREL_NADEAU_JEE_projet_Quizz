package projet.core.service;

import projet.core.dao.QuestionsDAO;

public class QuestionsService {

    private QuestionsDAO questionsDAO;

    public QuestionsService(final QuestionsDAO questionsDAO) { this.questionsDAO = questionsDAO; }}
