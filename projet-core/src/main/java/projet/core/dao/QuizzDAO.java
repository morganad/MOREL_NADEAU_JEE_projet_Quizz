package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.core.entity.Quizz;

public interface QuizzDAO extends JpaRepository<Quizz, Long> {
}
