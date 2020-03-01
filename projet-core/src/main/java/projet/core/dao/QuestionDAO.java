package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import projet.core.entity.Question;
import projet.core.entity.ReponsesQuestions;

import java.util.List;

public interface QuestionDAO extends JpaRepository<Question, Long> {

    @Query(
            value = "SELECT * FROM question q WHERE q.quizz_id =:quizz_id",
            nativeQuery = true)
    List<Question> getAllFromQuizzId(@Param("quizz_id") long quizzId);

    @Query(
            value = "SELECT * FROM question q WHERE q.id =:id",
            nativeQuery = true)
    Question getById(@Param("id") long questionId);

    @Query(
            value = "SELECT * FROM question q WHERE q.quizz_id=:quizz_id LIMIT 1 ",
            nativeQuery = true)
    Question findFirstQuestion(@Param("quizz_id")Long quizzId);
}

