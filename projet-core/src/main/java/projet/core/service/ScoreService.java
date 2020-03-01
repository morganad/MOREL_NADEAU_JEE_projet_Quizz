package projet.core.service;

import org.springframework.stereotype.Service;
import projet.core.dao.ScoreDAO;
import projet.core.dao.UtilisateurDAO;
import projet.core.entity.Score;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ScoreService {

    private ScoreDAO scoreDAO;

    public ScoreService(final ScoreDAO scoreDAO) { this.scoreDAO = scoreDAO; }

    public void save(Score utilisateurData) {
    }

    public int isPresent(long idUtilisateur) { return scoreDAO.isPresent(idUtilisateur);
    }

    public Score getScoreByUtilisateurId(long idUtilisateur) { return scoreDAO.getScoreByUtilisateurId(idUtilisateur);
    }

    public void saveScore(int meilleurScore, int dernierScore, long idUtilisateur) {
        scoreDAO.saveScore(meilleurScore, dernierScore, idUtilisateur);
    }

    public void upDateScore(int meilleurScore, int dernierScore, long idUtilisateur) { scoreDAO.updateScore(meilleurScore, dernierScore, idUtilisateur);
    }

    public List<Score> findAll() {return  scoreDAO.findAll();
    }
}
