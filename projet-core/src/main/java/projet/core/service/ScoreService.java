package projet.core.service;

import projet.core.dao.ScoreDAO;

public class ScoreService {

    private ScoreDAO scoreDAO;

    public ScoreService(final ScoreDAO scoreDAO) { this.scoreDAO = scoreDAO; }
}
