package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import projet.core.entity.Question;

import java.util.List;

public interface QuestionDAO extends JpaRepository<Question, Long> {

    @Query(
            value = "SELECT * FROM question q WHERE q.quizz_id =:quizz_id",
            nativeQuery = true)
    List<Question> getAllFromQuizzId(@Param("quizz_id") long quizzId);

}

