package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import projet.core.entity.Question;
import projet.core.entity.ReponsesQuestions;

import java.util.List;

public interface ReponsesQuestionsDAO extends JpaRepository<ReponsesQuestions, Long> {

    @Query(
            value = "SELECT * FROM reponsesquestions r WHERE r.question_id =:question_id",
            nativeQuery = true)
    List<ReponsesQuestions> getAllFromQuestionId(@Param("question_id") Long questionId);
}
