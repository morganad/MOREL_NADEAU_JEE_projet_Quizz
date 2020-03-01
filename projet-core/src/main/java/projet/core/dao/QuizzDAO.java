package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import projet.core.entity.Question;
import projet.core.entity.Quizz;

import java.util.List;


public interface QuizzDAO extends JpaRepository<Quizz, Long> {

}
