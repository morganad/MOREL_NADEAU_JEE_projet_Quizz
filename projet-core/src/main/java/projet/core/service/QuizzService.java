package projet.core.service;

import org.springframework.stereotype.Service;
import projet.core.dao.QuizzDAO;
import projet.core.entity.Quizz;
import projet.core.entity.Utilisateur;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class QuizzService {

    private QuizzDAO quizzDAO;

    public QuizzService(final QuizzDAO quizzDAO) { this.quizzDAO = quizzDAO; }

    public List<Quizz> findAll() { return quizzDAO.findAll(); }
}
