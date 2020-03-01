package projet.core.service;

import org.springframework.stereotype.Service;
import projet.core.dao.ReponsesQuestionsDAO;
import projet.core.entity.Question;
import projet.core.entity.ReponsesQuestions;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReponsesQuestionsService {

    private ReponsesQuestionsDAO reponsesQuestionsDAO;

    public ReponsesQuestionsService(final ReponsesQuestionsDAO reponsesQuestionsDAO) { this.reponsesQuestionsDAO = reponsesQuestionsDAO; }

    public List<ReponsesQuestions> findAllReponsesFromQuestionId(Long QuestionId) {
        return reponsesQuestionsDAO.getAllFromQuestionId(QuestionId);
    }

    public List<ReponsesQuestions> findALl() { return reponsesQuestionsDAO.findAll();
    }
}
