package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.core.entity.Questions;

public interface QuestionsDAO extends JpaRepository<Questions, Long> {
}
