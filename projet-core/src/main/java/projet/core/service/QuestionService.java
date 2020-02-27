package projet.core.service;

import org.springframework.stereotype.Service;
//import projet.core.dao.QuestionDAO;
import projet.core.dao.QuestionDAO;
import projet.core.entity.Question;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class QuestionService {

    private QuestionDAO questionDAO;

    public QuestionService(final QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    public List<Question> findAll() {
        return questionDAO.findAll();
    }

    public List<Question> findAllQuestionsFromQuizz(Long QuizzId) {
        return questionDAO.getAllFromQuizzId(QuizzId);
        //return questionDAO.findAll();
    }

}

